import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the first platform for Buck to stand on only in level 3
 * @author (Julien, Phuc) 
 * @version (1)
 */
public class Platform1 extends Actor
{
    /**
     * Setting the height
     */
    public Platform1()
    {
        this(100, 25);
    }
    /**
     * Platform1 constructor
     */
    public Platform1(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }      
}
