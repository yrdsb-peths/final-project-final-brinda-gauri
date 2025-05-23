import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TopPipe extends Actor
{
    int Speed = 4;
    public boolean passed = false;
    
    public void act()
    {
        GreenfootImage TopPipe = new GreenfootImage("top_pipe.png");
        setImage(TopPipe);
        
        setLocation(getX() - Speed, getY());
    }
}
