import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TopPipe extends Actor
{
    int pipeSpeed;
    public boolean passed = false;
    
    //This method creates the top pipe
    public TopPipe(int speed)
    {
        GreenfootImage TopPipe = new GreenfootImage("top_pipe.png");
        setImage(TopPipe);
        this.pipeSpeed = speed;
    }
    
    //This method sets the location of the top pipe and increases score if passed by flappy
    public void act()
    {
        setLocation(getX() - pipeSpeed, getY());
        
        if (!passed && getX() < 100)
        {
            passed = true;
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
    }
}
