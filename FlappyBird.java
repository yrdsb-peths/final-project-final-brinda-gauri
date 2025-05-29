import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double RAISE_SPEED = -10;
    GreenfootSound flappyDiedSound = new GreenfootSound("flappyDiedSound.mp3");
    
    public FlappyBird()
    {
        GreenfootImage flappy = new GreenfootImage("flappyBird.png");
        flappy.scale(50,50);
        setImage(flappy);
    }
    
    public void act()
    {
        setLocation(getX(), (int)(getY() + dy));
        
        if (getOneIntersectingObject(TopPipe.class) != null || 
            getOneIntersectingObject(BottomPipe.class) != null || 
            getY() > getWorld().getHeight())
        {
            flappyDiedSound.play();
            MyWorld world = (MyWorld)getWorld();
            Greenfoot.setWorld(new EndScreen(world.score));
            return;
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            dy = RAISE_SPEED;
        }
        
        if (dy < 1)
        {
            setRotation(-30);
        }
        else if (dy < 8) 
        {
            setRotation(0);
        }
        else if (dy < 12)
        {
            setRotation(50);
        }
        else if (dy < 30) 
        {
            setRotation(1);
        }
        
        dy = dy + g;
    }
}
