import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double RAISE_SPEED = -10;
    
    public FlappyBird()
    {
        GreenfootImage flappy = new GreenfootImage("FlappyBird.png");
        flappy.scale(45,45);
        setImage(flappy);
    }
    
    public void act()
    {
        setLocation(getX(), (int)(getY() + dy));
        
        if (Greenfoot.isKeyDown("space"))
        {
            dy = RAISE_SPEED;
        }
        
        if (dy < -2)
        {
            setRotation(-20);
        }
        else if (dy < 4) 
        {
            setRotation(0);
        }
        else 
        {
            setRotation(20);
        }
        
        if(getY() > getWorld().getHeight())
        {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            Greenfoot.stop();
        }
        
        dy = dy + g;
    }
}
