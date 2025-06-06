import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    public int score = 0;
    public static int highScore = 0;
    Label scoreLabel;
    GreenfootSound pointSound = new GreenfootSound("pointScoredSound.mp3");
    FlappyBird flappy;
    public int pipeSpeed = 4;
    
    //This method creates the game world by adding the background, flappy and score.
    public MyWorld() {
        super(800, 450, 1, false);
        setBackground(new GreenfootImage("Background.jpg"));
        
        flappy = new FlappyBird();
        addObject(flappy,100, getHeight()/2);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    
    //This method adds a pipe pair to the screen.
    public void act()
    {
        if(!flappy.started)
        {
            return;
        }
        
        counter++;
        if (counter == 100) 
         { 
            addPipePair();                
            counter = 0;
         }
    }
    
    //This method creates a pipe pair.
    public void addPipePair()
    {
        int gapSize = 200;
        int pipeX = getWidth();
        
        int minGapY = gapSize/2 + 50;
        int maxGapY = getHeight() - gapSize/2 - 50;
        
        int gapY = Greenfoot.getRandomNumber(maxGapY - minGapY + 1) + minGapY;
        
        TopPipe top = new TopPipe(pipeSpeed);
        BottomPipe bottom = new BottomPipe(pipeSpeed);
        
        int topHeight = top.getImage().getHeight();
        int bottomHeight = bottom.getImage().getHeight();
        
        int topY = gapY - gapSize/2 - topHeight/2;
        int bottomY = gapY + gapSize/2 + bottomHeight/2;
        
        addObject(top, pipeX, topY);
        addObject(bottom, pipeX, bottomY);
    }
    
    //This method increases the score when flappy pases through a set of pipes.
    public void increaseScore()
    {
        score++;
        if (score > MyWorld.highScore)
        {
            MyWorld.highScore = score;
        }
        pointSound.play();
        scoreLabel.setValue(score);
        
        if (score%10 == 0)
        {
            pipeSpeed++;
        }
    }
}
