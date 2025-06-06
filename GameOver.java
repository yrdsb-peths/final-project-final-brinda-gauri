import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Actor
{
    //This method set the Game Over image
    public GameOver()
    {
        GreenfootImage gameOver = new GreenfootImage("game_over.png");
        gameOver.scale(600,150);
        setImage(gameOver);
    }
}
