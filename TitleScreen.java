import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        prepare();
    }
    
    /**
     * The main world act loop
     */
    
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            
        }
    }
    
    /**
     * Prepare the world for the start of the program
     * That is: create an initial object and add them to the world
     */
    private void prepare(){
        Elephant elephant = new Elephant();
        addObject(elephant,479, 87);
        elephant.setLocation(520,113);

        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,297,120);
        label.setLocation(300,225);
        //label.setLocation(333,229);

        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,240,289);
        label2.setLocation(300,275);
        
        Label titleLabel = new Label("Hungry Elephant", 60);
        addObject(titleLabel,224,126);
    }
}
