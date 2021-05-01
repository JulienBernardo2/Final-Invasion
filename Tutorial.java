import lang.stride.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import greenfoot.*;

/**
 * This is the tutorial to help the player learn how to play
 * @author (Julien, Phuc) 
 * @version (5)
 */
public class Tutorial extends SimulationWorld
{
    
    /**
     * Constructor for objects of class Tutorial.
     */
    public Tutorial()
    {
        super("Tutorial.wav", 1000, 440);
        prepare();
        showText("       Learn how to help Buck" , 300, 60, 30, Color.WHITE);
        showText("(A) Go left   (D) Go right   (W) To jump", 300, 100, 24, Color.CYAN);
        showText("         Press (SPACE) when ready" , 300, 140, 24, Color.CYAN);
    }
    
        /**
     * Shows text on the screen with Green font
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
     * It creates the objects at start of the world
     */
    private void prepare()
    {
        Buck buck = new Buck();
        addObject(buck,53,286);
        buck.setLocation(32,384);
    }
    
    /**
     * If the player presses "space" he will transition to the next world
     */
    public void act()
    {       
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new Level1LoadingScreen());
        }
    }
}
