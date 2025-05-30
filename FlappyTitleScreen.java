import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyTitleScreen extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    int imageIndex = 0;
    
    public FlappyTitleScreen()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/flappy_idle/flappy" + i + ".png");
            idle[i].scale(70,70);
        }
        setImage(idle[0]);
    }

    public void act()
    {
        if (animationTimer.millisElapsed() < 150)
        {
            return;
        }
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    
    }
    
}
