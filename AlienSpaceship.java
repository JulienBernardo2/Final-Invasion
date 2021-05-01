import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The AlienSpaceship is meant to try and crash into buck and kill him
 * @author (Julien, Phuc)
 * version (3)
 */
public class AlienSpaceship extends Mover
{
    //Sets the image of the actor
    private final GreenfootImage alien1 = new GreenfootImage("Alien.png");
    
    // Creates an explosion object
    private Explosion explosion;
    
    // Sets music to a variable
    private GreenfootSound music = new GreenfootSound("Explosion.wav");
    /**
     * AlienSpaceship constructor
     */
    public AlienSpaceship(int placement){
        this.speed = 5;
        setImage(alien1);
        alien1.scale(60, 50);
    }

    /**
     * Sets up what the AlienSpaceships will be able to do
     */
    public void act() 
    {
        moveDown();
        if (getY() >= 649)
        {
            getWorld().removeObject(this);
        }
        else 
        {
            collisionDetection();
        }
    }

    /**
     * Checks if their was a collision with the rocket, if so
     * they both die
     */
    private void collisionDetection(){
        if(Rocket.isDead == false)
        {
            if(getOneObjectAtOffset(-11,19, Rocket.class) != null || getOneObjectAtOffset(11,19, Rocket.class)
            != null)
            {                
                Rocket.isDead = true;
                getWorld().removeObject(this);
                music.play();
            }
        }    
    }
}

