import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BottomPipe extends Actor
{
    int pipeSpeed;
    
    //This method creates the bottom pipe.
    public BottomPipe(int speed)
    {
        GreenfootImage BottomPipe = new GreenfootImage("bottom_pipe.png");
        setImage(BottomPipe);
        this.pipeSpeed = speed;
    }
    
    //This method sets the location of the bottom pipe
    public void act()
    {
        setLocation(getX() - pipeSpeed, getY());
    }
}
