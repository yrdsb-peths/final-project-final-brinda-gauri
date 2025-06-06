import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{    
    //This method creates a title screen by adding the background images and several labels.
    public TitleScreen()
    {    
        super(800, 450, 1); 

        setBackground(new GreenfootImage("Background.jpg"));
        
        prepare();
    }
    
    //This method switches to the game world when the space key is pressed
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * This method adds labels and objects showing the title name, how to play,
     * and 3 animated flappys
     */
    private void prepare()
    {
        Label spaceLabel = new Label("Press <space> to Start & Play", 30);
        addObject(spaceLabel,getWidth()/2,300);
        
        TitleName title = new TitleName();
        addObject(title, getWidth()/2, 150);
        
        FlappyTitleScreen flappy = new FlappyTitleScreen();
        addObject(flappy,getWidth()/2-100,375);
        
        FlappyTitleScreen flappy2 = new FlappyTitleScreen();
        addObject(flappy2,getWidth()/2,375);
        
        FlappyTitleScreen flappy3 = new FlappyTitleScreen();
        addObject(flappy3,getWidth()/2+100,375);
        
    }
}
