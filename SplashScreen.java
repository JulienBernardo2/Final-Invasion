
import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;


/**
 * It is the splash screen for our game
 * @author (Julien, Phuc) 
 * @version (1)
 */
public class SplashScreen extends SimulationWorld
{
    //Sets up a variable for the amount of time since the splash screen started
    private double timeSplashScreenCreation = System.currentTimeMillis();

    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super("", 900, 600);
        showTextWithRedFont("by", 430, 330, 40);
        showTextWithRedFont("Computer Science Department", 190, 250, 40);
        showTextWithRedFont("VANIER COLLEGE", 285, 100, 40);
        showTextWithRedFont("Julien Bernardo", 350, 420, 30);
        showTextWithRedFont("Phuc Nguyen", 365, 470, 30);
    }

    /**
     * Shows text on the screen with Red font
     */
    public void showTextWithRedFont(String message, int x, int y, int size)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(size);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }

    /**
     * Sets up the timer to transition to the next screen
     */
    public void act()
    {
        if (System.currentTimeMillis() >= (timeSplashScreenCreation + (4 * 1000)))
        {
            transitionToWorld(new TitleScreen());
        }
    }
}
