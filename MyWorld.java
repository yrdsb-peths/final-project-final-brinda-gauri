import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    public int score = 0;
    Label scoreLabel;
        
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
        int minY = 100;
        int maxY = getHeight() - 100 - gapSize;
        
        int gapY = Greenfoot.getRandomNumber(maxY - minY + 1) + minY;
        
        TopPipe top = new TopPipe();
        BottomPipe bottom = new BottomPipe();
        
        int pipeX = getWidth();
        
        addObject(top, pipeX, gapY - top.getImage().getHeight()/2 - gapSize/2);
        addObject(bottom, pipeX, gapY + bottom.getImage().getHeight()/2 + gapSize/2);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
