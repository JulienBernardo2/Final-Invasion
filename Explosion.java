import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Apapears when a AlienSpaceship dies
 * @author (Julien, Phuc) 
 * @version (3)
 */
public class Explosion extends Mover
{
    //Sets the image of the explosion actor
    private GreenfootImage explosion = new GreenfootImage("Explosion.png");

    //Sets a timer for when the explosion actor has been created in the world
    private double timeExplosion = System.currentTimeMillis(); 
    /**
     * Explosion constructor
     */
    public Explosion(){
        setImage(explosion);
        explosion.scale(70, 70); 
    }

    /**
     * Sets up what the Explosion will be able to do
     */
    public void act() 
    {
        if (Rocket.isDead != true && System.currentTimeMillis() >= (timeExplosion + (200)))
        {
            getWorld().removeObject(this);
        }
    }    
}
