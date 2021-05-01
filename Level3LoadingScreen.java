import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Explaining the story for the third level
 * @author (Julien, Phuc) 
 * @version (4)
 */
public class Level3LoadingScreen extends SimulationWorld
{
    //Sets up a variable for the amount of time since the loading screen started
    private double timeLevel2LoadinScreen = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class Level3LoadingScreen.
     */
    public Level3LoadingScreen()
    {    
        super("LevelsWaitingScreen.wav", 1000, 600);
        showText("GET TO SPACE", 200, 180, 80, Color.GREEN);
        showText("Help Buck get to his rocket", 330, 400, 25, Color.WHITE);
        showText("To infinity and beyond", 360, 460, 25, Color.WHITE);
        showText("(A) LEFT  (D) RIGHT  (W) JUMP  (SPACE) ENTER", 280, 540, 18, Color.CYAN);
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
        if (System.currentTimeMillis() >= (timeLevel2LoadinScreen + (10 * 1000)))
        {
             transitionToWorld(new Level3());
        }
    }
}

