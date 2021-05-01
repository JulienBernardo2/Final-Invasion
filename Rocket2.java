import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This rocket is for Level 3 so buck could get to the final level
 * @author (Julien, Phuc) 
 * @version (2)
 */
public class Rocket2 extends Actor
{
    /**
     * Setting the height
     */
    public Rocket2()
    {
        this(100, 25);
    }
    /**
     * Rocket constructor
     */public Rocket2(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }

    /**
     * This is Everything that the Rocket can do
     */
    public void act() 
    {
        if (isTouching(BunkerBuck.class)) {
                if (Greenfoot.isKeyDown("e"))
                {
                    ((SimulationWorld) getWorld()).transitionToWorld(new FinalLevelLoadingScreen());
                }
        }       
    }
}
