import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BottomPipe extends Actor
{
    int PIPE_SPEED = 4;
    
    public BottomPipe()
    {
        GreenfootImage BottomPipe = new GreenfootImage("bottom_pipe.png");
        setImage(BottomPipe);
    }
    
    public void act()
    {
        setLocation(getX() - PIPE_SPEED, getY());
    }
}
