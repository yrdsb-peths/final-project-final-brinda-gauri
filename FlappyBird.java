import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    
    public FlappyBird()
    {
        GreenfootImage flappy = new GreenfootImage("FlappyBird.png");
        flappy.scale(45,45);
        setImage(flappy);
    }
    
    public void act()
    {
        setLocation(getX(), (int)(getY() + dy));
        if (Greenfoot.isKeyDown("space")){
            dy = -10;
        }
        dy = dy + g;
    }
}
