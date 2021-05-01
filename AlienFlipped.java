import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a different version of the alien which moves right to left instead
 * of randomly and is meant to be the main enemy for Buck
 * @author (Julien, Phuc) 
 * @version (4) 
 */
public class AlienFlipped extends Actor
{
    public GreenfootImage alienImage;
    public GifImage alienGifImage;
    public int nb_images;

    /**
     * Constructor for objects of class AlienFlipped
     */
    public AlienFlipped()
    {
        alienGifImage = new GifImage("AlienFlipped.gif");
        nb_images = alienGifImage.getImages().size();
    }

    /**
     * Everything which the Alien can do
     */
    public void act() 
    {
        alienImage = alienGifImage.getCurrentImage();
        setImage(alienImage);
        killBuck();
        killBunkerBuck();
        moveAround();
    }

    /**
     * Lets the alien Kill the Buck actor
     */
    public void killBuck()
    {
        if (isTouching(Buck.class)) {
            removeTouching(Buck.class);
            ((SimulationWorld) getWorld()).transitionToWorld(new LoseScreen());
        }
    }

    /**
     * Lets the alien Kill the BunkeyBuck actor
     */
    public void killBunkerBuck()
    {
        if (isTouching(BunkerBuck.class)) {
            removeTouching(BunkerBuck.class);
            ((SimulationWorld) getWorld()).transitionToWorld(new LoseScreen());
        }
    }

    /**
     * Lets the Alien move around the world from right to left
     */
    public void moveAround()
    {
        move(1);
        if (isAtEdge()) {
            turn(180);
        }
    }
}
