import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;

/**
 * This screen explains the story for the full game 
 * @author (Julien, Phuc) 
 * @version (5)
 */
public class StoryScreen extends SimulationWorld
{

    /**
     * Constructor for objects of class StoryScreen
     */
    public StoryScreen()
    {
        super("", 900, 600);
        showText("STORY PREVIEW", 270, 60, 40, Color.GREEN);
        showText("Our planet is under attack", 270, 190, 30, Color.WHITE);
        showText("King Aien has sent his ships to destroy us all ", 150, 270, 30, Color.WHITE);
        showText("It's up to Buck to save us", 270, 350, 30, Color.WHITE);
        showText("Help him to destroy King Alien", 230, 430, 30, Color.WHITE);
        prepare();
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
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackButton backButton = new BackButton();
        addObject(backButton,455,497);
        backButton.setLocation(461,493);
    }
}
