import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When in level 2, Buck needs to press "e" on this to transtion to level 3
 * 
 * @author (Julien) 
 * @version (2)
 */
public class Door extends Actor
{
    /**
     * This is everything that the Door actor can do
     */
    public void act() 
    {
        if (isTouching(Buck.class)) {
            if (Greenfoot.isKeyDown("e"))
            {
                ((SimulationWorld) getWorld()).transitionToWorld(new Level3LoadingScreen());
            }
        }
    }
}
