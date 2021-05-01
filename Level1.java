import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;

/**
 * This is the first level of the game where Buck must survive for 15 seconds
 * 
 * @author (Julien, Phuc) 
 * @version (5)
 */
public class Level1 extends SimulationWorld
{
    //Sets up a variable for the amount of time since the level started
    private double timeLevel1 = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class Level1
     */
    public Level1()
    {
        super("Level1.wav", 1100, 440);
        prepare();
    }
    
    /**
     * It creates the objects at start of the world
     */
    private void prepare()
    {
        Aliens aliens = new Aliens();
        addObject(aliens,106,97);
        Aliens aliens2 = new Aliens();
        addObject(aliens2,548,274);
        Aliens aliens3 = new Aliens();
        addObject(aliens3,890,190);
        Platform2 platform2 = new Platform2(100, 25);
        addObject(platform2,231,319);
        platform2.setLocation(180,323);
        Platform2 platform22 = new Platform2(100, 25);
        addObject(platform22,284,233);
        platform22.setLocation(387,217);
        Platform2 platform23 = new Platform2(100, 25);
        addObject(platform23,572,332);
        platform23.setLocation(565,338);
        Platform2 platform24 = new Platform2(100, 25);
        addObject(platform24,711,212);
        platform24.setLocation(742,223);
        Platform2 platform25 = new Platform2(100, 25);
        addObject(platform25,934,321);
        platform25.setLocation(884,137);
        platform25.setLocation(890,336);
        platform25.setLocation(956,328);
        platform24.setLocation(782,255);
        platform22.setLocation(415,212);
        AlienFlipped alienFlipped2 = new AlienFlipped();
        addObject(alienFlipped2,732,105);
        alienFlipped2.setLocation(767,336);
        Buck buck = new Buck();
        addObject(buck,428,368);
        buck.setLocation(426,387);
    }

    /**
     * We set up a timer for the amount of time left for the world and
     * also transitions to the next screen when the timer is up
     */
    public void act()
    {
        Display display = new Display();
        addObject(display , 550, 15);

        int countDown = (int) ((timeLevel1 + (15 * 1000)) - System.currentTimeMillis())/1000;

        if(countDown<10)
        {
            display.setImage(new GreenfootImage(" Count down 0" + countDown + " " , 24, Color.GREEN, Color.WHITE));
        }
        else
        {
            display.setImage(new GreenfootImage(" Count down " + countDown + " " , 24, Color.GREEN, Color.WHITE));
        }
        
        if (System.currentTimeMillis() >= (timeLevel1 + (15 * 1000)))
        {
            transitionToWorld(new Level2LoadingScreen());
        }
    }
}
