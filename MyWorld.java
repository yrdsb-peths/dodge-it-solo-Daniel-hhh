import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() 
    {
        super(600, 400, 1);
        
        Leo leo = new Leo();
        addObject(leo, 250, 250);
        
        bee Bee = new bee();
        addObject(Bee, 666,111);
    }
}
