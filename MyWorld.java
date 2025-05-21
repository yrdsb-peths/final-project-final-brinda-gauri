import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 450, 1);
        
        //Sets the background image
        setBackground(new GreenfootImage("Background.jpg"));
        
        FlappyBird flappy = new FlappyBird();
        addObject(flappy, 100, getHeight()/2);
    }
    
    
}
