import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double RAISE_SPEED = -10;
    GreenfootSound flappyDiedSound = new GreenfootSound("flappyDiedSound.mp3");
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public FlappyBird()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/flappy_idle/flappy" + i + ".png");
            idle[i].scale(40,40);
        }
    
        setImage(idle[0]);
    }

    int imageIndex = 0;
    public void animateFlappy()
    {
        if (animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    
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
            Greenfoot.setWorld(new EndScreen(world.score, MyWorld.highScore));
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
