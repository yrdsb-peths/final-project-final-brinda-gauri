import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleName extends Actor
{
    //This method sets the title image
    public TitleName()
    {
        GreenfootImage title = new GreenfootImage("Flappy_Logo.png");
        title.scale(650,200);
        setImage(title);
    }
}
