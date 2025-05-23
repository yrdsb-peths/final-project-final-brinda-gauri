import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BottomPipe extends Actor
{
    int PIPE_SPEED = 4;
    /**
     * Act - do whatever the BottomPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage BottomPipe = new GreenfootImage("bottom_pipe.png");
        setImage(BottomPipe);
        
        setLocation(getX() - PIPE_SPEED, getY());
    }
}
