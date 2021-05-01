import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;

/**
 * This is the title screen where the player starts the game
 * @author (Julien, Phuc) 
 * @version (8)
 */
public class TitleScreen extends SimulationWorld
{

    /**
     * Constructor for objects of class TitleScreen
     */
    public TitleScreen()
    {
        super("TitleMenu.wav", 900, 600);
        showText("FINAL INVASION", 30, 180, 70, Color.GREEN);
        setMusic(music);
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
        StoryButton storyButton = new StoryButton();
        addObject(storyButton,298,246);
        ControlButton controlButton = new ControlButton();
        addObject(controlButton,296,336);
        TrainingButton trainingButton = new TrainingButton();
        addObject(trainingButton,297,436);
        StartButton startButton = new StartButton();
        addObject(startButton,314,542);
    }
}
