import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Explaining the story for the final level
 * @author (Julien, Phuc) 
 * @version (2)
 */
public class FinalLevelLoadingScreen extends SimulationWorld
{
    //Sets up a variable for the amount of time since the loading screen started
    private double timeFinalLevelLoadinScreen = System.currentTimeMillis();
   
    /**
     * Constructor for objects of class FinalLevelLoadingScreen.
     */
    public FinalLevelLoadingScreen()
    {    
        super("LevelsWaitingScreen.wav", 1000, 600);
        showText("FINAL BATTLE IN SPACE", 90, 180, 70, Color.GREEN);
        showText("  The Alien King continues to send his ships to earth ", 190, 420, 25, Color.WHITE);
        showText("Shoot enough Alien ships to force the Alien King to retreat !!", 160, 470, 25, Color.WHITE);
        showText("(A) LEFT  (D) RIGHT  (SPACE) SHOOT", 320, 540, 18, Color.CYAN);
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
        if (System.currentTimeMillis() >= (timeFinalLevelLoadinScreen + (12 * 1000)))
        {
            transitionToWorld(new Space()); 
        }
    }
}

