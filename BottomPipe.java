import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BottomPipe extends Actor
{
    int pipeSpeed;
    
    public BottomPipe(int speed)
    {
        GreenfootImage BottomPipe = new GreenfootImage("bottom_pipe.png");
        setImage(BottomPipe);
        this.pipeSpeed = speed;
    }
    
    public void act()
    {
        setLocation(getX() - pipeSpeed, getY());
    }
}
