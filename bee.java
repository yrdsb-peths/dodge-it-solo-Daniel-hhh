import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class bee extends Actor
{
    public void act()
    {
        move(-10);
        if(getX()<=0)
        {
            resetbee();
        }
        if(isTouching(Leo.class))
        {
            Happyface happyFace = new Happyface();
            getWorld().addObject(happyFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
public void resetbee()
{
    int num = Greenfoot.getRandomNumber(2);
    if(num == 0)
    {
        setLocation(600,100);
    }
    else
    {
        setLocation(600,300);
    }
}
}
