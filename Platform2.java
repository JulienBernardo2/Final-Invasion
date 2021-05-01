import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the second platform for Buck to stand on in every level except level 13
 * @author (Julien, Phuc) 
 * @version (1)
 */
public class Platform2 extends Actor
{    
    /**
     * Setting the height
     */
    public Platform2()
    {
        this(100, 25);
    }
    /**
     * Platform2 costructor
     */
    public Platform2(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }  
}
