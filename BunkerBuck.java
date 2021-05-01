import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;

/**
 * This Buck is when he is in the bunker and interacts with platform 1 instead
 * of platform 2
 * @author (Julien, Phuc) 
 * @version (3)
 */
public class BunkerBuck extends Actor
{
    //Sets the Gravity of the world
    private final int GRAVITY = 1;
    
    //Sets the amount of steps the actor can move 
    private final int STEP = 3;
    
    //The velocity of the Actor
    private int velocity;

    /**
     * Constructor for objects of class Buck
     */
    public BunkerBuck(){
        velocity = 5;        
    } 

    /**
     * Sets up what Buck will be able to do
     */
    public void act()
    {
        fall();
        if ( Greenfoot.isKeyDown("w") && isOnSolidGround( ))jump();
        move();
    }

    /**
     * It lets the actor fall back to the bottom of the world
     */
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (isOnSolidGround ())
        {
            velocity = 0;

            while (isOnSolidGround())
            {
                setLocation(getX(), getY() -1);
            }
            setLocation(getX(), getY() + 1);
        }
        else if(velocity < 0 && didBumpHead()) 
        {
            velocity = 0;

            while (didBumpHead())
            {
                setLocation(getX(), getY() +1);
            }
        }
        else 
        {
            velocity += GRAVITY;
        }        
    }

    /**
     * Lets the actor jump up with a certain speed
     */
    public void jump()
    {
        velocity = -20;      
    }

    /**
     * Lets the actor move left and right with a certain amount of steps
     */
    public void move()
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a") && canMoveLeft())
        {
            setImage("Buck2.png");
            x-= STEP;
        }
        if(Greenfoot.isKeyDown("d") && canMoveRight())
        {
            setImage("Buck1.png");
            x+= STEP;
        }
        setLocation(x, y);
    }

    /**
     * Check is the actor is on any ground weather it is a platform or the 
     * bottom of the world
     */
    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;
        if (getY() > getWorld().getHeight()- 50)
        {
            isOnGround = true;
        }
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform1.class)!= null || 
        (getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform1.class) != null))
        {
            isOnGround = true; ;
        }
        return isOnGround;
    }

    /**
     * Check if the actor hit a platform
     */
    public boolean didBumpHead()
    {
        boolean bumpedHead = false;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, Platform1.class)!= null || 
        (getOneObjectAtOffset(imageWidth / 2, imageHeight / -2, Platform1.class) != null))
        {
            bumpedHead = true; ;
        }

        return bumpedHead;
    }

    /**
     * Check if the actor can move left, if not then there is a wall/platform
     * in his way
     */
    public boolean canMoveLeft()
    {
        boolean canMoveLeft= true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / -2, Platform1.class)!= null || 
        (getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / 2 - 1, Platform1.class) != null))
        {
            canMoveLeft = false;
        }

        return canMoveLeft;
    }

    /**
     * Check if the actor can move right, if not then there is a wall/platform
     * in his way
     */
    public boolean canMoveRight()
    {
        boolean canMoveRight= true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / -2, Platform1.class)!= null || 
        (getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / 2 - 1, Platform1.class) != null))
        {
            canMoveRight = false;
        }

        return canMoveRight;
    }
}