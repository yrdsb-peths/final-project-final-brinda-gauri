import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 455, 1);
        
        //Sets the background image
        setBackground(new GreenfootImage("Background.jpg"));
        
        FlappyBird flappy = new FlappyBird();
        addObject(flappy, 300, 300);
    }
    
    
}
