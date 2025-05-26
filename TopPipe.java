import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TopPipe extends Actor
{
    int Speed = 4;
    public boolean passed = false;
    
    public TopPipe()
    {
        GreenfootImage TopPipe = new GreenfootImage("top_pipe.png");
        setImage(TopPipe);
    }
    
    public void act()
    {
        setLocation(getX() - Speed, getY());
        
        if (!passed && getX() < 100)
        {
            passed = true;
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
    }
}
