import greenfoot.*;

public class MyWorld extends World {
    int counter = 0;
    
    public MyWorld() {
        super(800, 450, 1, false);
        
        //Sets the background image
        setBackground(new GreenfootImage("Background.jpg"));
        
        
        FlappyBird flappy = new FlappyBird();
        
        addObject(flappy, 100, getHeight()/2);
    }
    
    public void act()
    {
         counter++;
         
         if (counter == 100) 
         {
             TopPipe top = new TopPipe();
             BottomPipe bottom = new BottomPipe();
             
             addObject(top, getWidth(), getHeight()/2);
             addObject(bottom, getWidth(), getHeight()/2);
             
             System.out.println(counter);
             counter = 0;
         }
    }
}
