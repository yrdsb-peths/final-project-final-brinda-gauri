import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndScreen extends World
{
    /**
     * This method creates an end screen by adding the background, and some
     * labels showing the score, high score and how to restart the game.
     */
    public EndScreen(int score, int highScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        
        setBackground(new GreenfootImage("Background.jpg"));
        
        GameOver gameOver = new GameOver();
        addObject(gameOver, getWidth()/2, 150);
        
        Label restartLabel = new Label ("Press <space> to Restart", 30);
        addObject(restartLabel, getWidth()/2, 385);
        
        Label highScoreLabel = new Label ("High Score: " + highScore, 30);
        addObject(highScoreLabel, getWidth()/2, 310);
        
        Label finalScore = new Label ("Your Score: " + score, 30);
        addObject(finalScore, getWidth()/2, 270);
    }
    
    //This method starts the game when the space key is pressed.
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
