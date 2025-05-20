import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 600, 1);
        
        //Sets the background image
        setBackground(new GreenfootImage("FlappyWorld.jpg"));
        
        FlappyBird flappy = new FlappyBird();
        addObject(flappy, 300, 300);
    }
    
    
}
