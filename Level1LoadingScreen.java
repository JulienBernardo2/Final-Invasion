import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;

/**
 * Explaining the story for the first level
 * @author (Julien, Phuc) 
 * @version (4)
 */
public class Level1LoadingScreen extends SimulationWorld
{
    //Sets up a variable for the amount of time since the loading screen started
    private double timeLevel1LoadinScreen = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class Level1LoadingScreen.
     */
    public Level1LoadingScreen()
    {
        super("LevelsWaitingScreen.wav", 1000, 600);
        showText("SURVIVE THE ALIENS", 120, 180, 70, Color.GREEN);
        showText("The Aliens have invaded", 340, 440, 25, Color.WHITE);
        showText("Help Buck survive 15 seconds!", 300, 530, 25, Color.CYAN);
    }
        
    /**
     * Shows text on the screen
     */
    public void showText(String message, int x, int y, int size, Color color)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(size);
        bg.setFont(font);
        bg.setColor(color);
        bg.drawString(message, x, y);
    }
    
    /**
     * Sets up the timer to transition to the next screen
     */
    public void act()
    {
        if (System.currentTimeMillis() >= (timeLevel1LoadinScreen + (6 * 1000)))
        {
            transitionToWorld(new Level1());
        }
    }    
}

