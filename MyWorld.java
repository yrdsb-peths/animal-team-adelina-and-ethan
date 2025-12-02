import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
<<<<<<< Updated upstream

        super(600, 400, 1);
=======
>>>>>>> Stashed changes
        //setImage("background.jpg");
        
        super(600, 400, 1, false);
        
        //create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        //create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }

    /**
     * end the game and draw "GameOver"
     */
    public void gameOver() {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * increase score
     */
    public void increaseScore() {
        score ++;
        scoreLabel.setValue(score);
    }
    
    /**
     * create a new apple at random location at top of screen
     */
    public void createApple() {
        Apple apple= new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
