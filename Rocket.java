import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random; // Provides funcionality for random integers, taken from StackOverflow (http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java).

/**
 * The rocket will be the main actor for the player to control
 * @author (Julien, Phuc)
 *  version (3)
 */
public class Rocket extends Mover
{
    //Sets the image of the actor
    private GreenfootImage rocket = new GreenfootImage("Rocket2.png");
    
    // Creates a Bullet object
    public Bullet bullet1;
    
    //Determine if the Rocket is dead
    public static boolean isDead;
    
    //Sets up the use of random variables
    private Random rand = new Random();
    
    //A counter for the amount of Aliens
    public int alienCounter;
    
    //Creates a AlienSpaceship object
    public AlienSpaceship alien1;

    /**
     * Rocket constructor
     */
    public Rocket(){
        this.speed = 7;
        setImage(rocket);
        rocket.scale(60,90); 
        Rocket.isDead = false;
        bullet1 = new Bullet();
    }

    /**
     * Sets up what the Rocket will be able to do
     */
    public void act() 
    {
        alienCounter++;
        if (isDead != true)
        {
            checkKeys();
            if(alienCounter >= 30)
            {
                alien1 = new AlienSpaceship(rand.nextInt(2));
                getWorld().addObject(alien1, rand.nextInt(1000), + 50);
                alienCounter = 1;
            }   
        }
        else
        {
            ((SimulationWorld) getWorld()).transitionToWorld(new LoseScreen());
        }

    }

    /**
     * Checks which key is pressed and allows the player to move and shoot
     */
    private void checkKeys(){
        if (Greenfoot.isKeyDown("d"))
        {
            moveRight();
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(bullet1, getX(), getY());
        }    
    }
}