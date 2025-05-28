import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        
        setBackground(new GreenfootImage("Background.jpg"));
        
        GameOver gameOver = new GameOver();
        addObject(gameOver, getWidth()/2, 150);
        
        Label restartLabel = new Label ("Press <space> to Restart", 30);
        addObject(restartLabel, getWidth()/2, 300);
        
        Label finalScore = new Label ("Your score was...", 30);
        addObject(finalScore, getWidth()/2, 350);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
