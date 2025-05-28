import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndScreen extends World
{
    public EndScreen()
    {    
        super(800, 450, 1); 
        
        setBackground(new GreenfootImage("Background.jpg"));
        
        GameOver gameOver = new GameOver();
        addObject(gameOver, getWidth()/2, 150);
        
        Label restartLabel = new Label ("Press <space> to Restart", 30);
        addObject(restartLabel,getWidth()/2,300);
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
