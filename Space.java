import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * The final level where Buck fights the King Alien
 * @author (Julien, Phuc) 
 * @version (4)
 */
public class Space extends SimulationWorld
{ 
    // Gets the bacground from the world so we can edit the size
    private GreenfootImage background = getBackground(); 
    
    /**
     * Constructor for objects of class Space
     */
    public Space()
    {    
        super("FinalLevel.wav", 1000, 650); 
        Greenfoot.setSpeed(50);
        addObject(new Rocket(), 500, 580);
        background.scale(1000, 650);
    }     
}
