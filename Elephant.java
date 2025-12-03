import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * elephant, our hero
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound ("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    //direction the elephant is facing
    String facing = "right";
    
    /**
     * constructor
     */
    public Elephant() {
        for (int i=0; i< idleRight.length; i++) {
            idleRight[i] = new GreenfootImage ("images/elephant_idle/idle"+ i +".png");
            idleRight[i].scale (100, 100);
        }
        
        for (int i=0; i< idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage ("images/elephant_idle/idle"+ i +".png");
            idleLeft[i].scale (100, 100);
        }
        setImage(idleRight[0]);
    }
    
    /**
     * animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant() {
        setImage (idle[imageIndex]);
        imageIndex = (imageIndex+1) % idle.length;
    }
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")) {
            move(-1);
        } else if (Greenfoot.isKeyDown("right")) {
            move(1);
        }
        
        // remove apple is elephant eats it
        eat();
        
        //animate the elephant
        animateElephant();
    }
    
    public void eat() {
        if (isTouching(Apple.class)) {
            removeTouching (Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
