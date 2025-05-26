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
        TopPipe top = new TopPipe();
        BottomPipe bottom = new BottomPipe();
        
        addObject(top, getWidth(), -20);
        addObject(bottom, getWidth(), getHeight()+20);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
