import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for our elephant
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage apple = new GreenfootImage ("images/apple.png");
    public Apple() {
        setImage (apple);
        apple.scale (40, 40);
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation (getX(), getY()+1);
        
        // remove appl eand draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    

}
