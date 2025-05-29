import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Actor
{
    public void act()
    {
        // Add your action code here.
    }
    
    public GameOver()
    {
        GreenfootImage gameOver = new GreenfootImage("game_over.png");
        gameOver.scale(600,150);
        setImage(gameOver);
    }
}
