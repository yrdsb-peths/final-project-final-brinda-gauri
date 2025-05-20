import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        FlappyBird flappy = new FlappyBird();
        addObject(flappy, 300, 300);
    }
    
    
}
