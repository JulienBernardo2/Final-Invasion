import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * The bullets which the actor shoots
 * @author (Julien, Phuc)
 */
public class Bullet extends Mover
{
    //Sets the image of the actor
    private final GreenfootImage bullet = new GreenfootImage("bullet.png");

    //Creates an Explosion object
    private Explosion explosion;

    //Sets the how many aliens need to be killed to win
    private int win = 10 + Greenfoot.getRandomNumber(10);

    //Sets a counter for the amount of AlienSpaceships were killed
    public int winCounter = 0;

    //Sets the sound of when the bullet hits an alien
    private GreenfootSound explosionSound = new GreenfootSound("Explosion.wav");

    //Sets the sound of when the bullets are being shot
    private GreenfootSound shooting = new GreenfootSound("Pew.wav");

    /**
     * Bullet contructor
     */
    public Bullet(){
        this.speed = 36;
        setImage(bullet);
    }

    /**
     * Sets up what the Bullet will be able to do
     */
    public void act() 
    {
        shooting.play();
        moveUp();
        if (getY() <= 5){
            getWorld().removeObject(this);
        }else if(getOneObjectAtOffset(0, 2, AlienSpaceship.class) != null){
            explosion = new Explosion();
            getWorld().addObject(explosion, this.getX(), this.getY());
            getWorld().removeObject(getOneObjectAtOffset(0, 8, AlienSpaceship.class));
            explosionSound.play();
            winCounter++;
            checkWin();
            getWorld().removeObject(this);
        }
    }

    /**
     * Checks if the Rocket has killed enough AlienSpaceships to win
     */
    public void checkWin()
    {
        if( winCounter == win)
        {
            ((SimulationWorld) getWorld()).transitionToWorld(new WinScreen());
        }
    }
}

