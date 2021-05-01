import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This version of the alien moves in any direction randomly and is meant to be the
 * main enemy of Buck 
 * @author (Julien, Phuc) 
 * @version (4)
 */
public class Aliens extends Actor
{
    public GreenfootImage alienImage;
    public GifImage alienGifImage;
    private int nb_images;

    /**
     * Constructor for objects of class Alien
     */
    public Aliens()
    {
        alienGifImage = new GifImage("Alien.gif");
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
     * Lets the Alien move around the world in any direction randomly
     */
    public void moveAround()
    {
        move(1);
        if (Greenfoot.getRandomNumber(60) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
}