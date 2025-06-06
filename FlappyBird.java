import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double RAISE_SPEED = -10;
    GreenfootSound flappyDiedSound = new GreenfootSound("flappyDiedSound.mp3");
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    boolean started = false;
    private boolean waitingForKeyRelease = true;
    
    //This method sets the flapp y image to the starting image for animation
    public FlappyBird()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/flappy_idle/flappy" + i + ".png");
            idle[i].scale(40,40);
        }
    
        setImage(idle[0]);
    }

    //This method creates the flappy animation
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
    
    /**
     * This method starts the game when the space key is pressed and changes 
     * the rotation of flappy depending f he is going up or down. This method
     * also queue's the end screen when flappy collides with the pipes or falls
     * to the ground. 
     */
    public void act()
    {
        animateFlappy();
        
        if(!started)
        {
            if(waitingForKeyRelease)
            {
                if(!Greenfoot.isKeyDown("space"))
                {
                   waitingForKeyRelease = false;
                } 
                return;
            }
            
            if(Greenfoot.isKeyDown("space"))
            {
                started = true;
                dy = RAISE_SPEED;
            }
            return;
        } 
        
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
