import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Helps the spaceship, enemy, and projectile move in the Final level
 * @author (Julien, Phuc)
 * version (2)
 */
public class Mover extends Actor
{
    //To set the speed of subclass actors
    public int speed;
    
    //Checks if a key is pressed
    public boolean isKeyPressed;
    /**
     * Moves any of the subclass actors to the right
     */
    public void moveRight(){
        setLocation(getX() + speed, getY());
    }

    /**
     * Moves any of the subclass actors to the left
     */
    public void moveLeft(){
        setLocation(getX() - speed, getY());
    }
    
    /**
     * Moves any of the subclass actors upwards
     */
    protected void moveUp(){
        setLocation(getX(), getY() - speed);
    }
    
    /**
     * Moves any of the subclass actors downwards
     */
    protected void moveDown(){
        setLocation(getX(), getY() + speed);
    }
}
