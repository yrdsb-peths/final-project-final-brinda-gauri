import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    public int score = 0;
    Label scoreLabel;
    GreenfootSound pointSound = new GreenfootSound("pointScoredSound.mp3");
        
    public MyWorld() {
        super(800, 450, 1, false);
        setBackground(new GreenfootImage("Background.jpg"));
        
        FlappyBird flappy = new FlappyBird();
        addObject(flappy,100, getHeight()/2);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    
    public void act()
    {
         counter++;
         
         if (counter == 100) 
         { 
            addPipePair();                
            counter = 0;
         }
    }
    
    public void addPipePair()
    {
        int gapSize = 200;
        int pipeX = getWidth();
        
        int minGapY = gapSize/2 + 50;
        int maxGapY = getHeight() - gapSize/2 - 50;
        
        int gapY = Greenfoot.getRandomNumber(maxGapY - minGapY + 1) + minGapY;
        
        TopPipe top = new TopPipe();
        BottomPipe bottom = new BottomPipe();
        
        int topHeight = top.getImage().getHeight();
        int bottomHeight = bottom.getImage().getHeight();
        
        int topY = gapY - gapSize/2 - topHeight/2;
        int bottomY = gapY + gapSize/2 + bottomHeight/2;
        
        addObject(top, pipeX, topY);
        addObject(bottom, pipeX, bottomY);
    }
    
    public void increaseScore()
    {
        score++;
        pointSound.play();
        scoreLabel.setValue(score);
    }
}
