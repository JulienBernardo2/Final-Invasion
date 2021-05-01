import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Explaining the story for the second level
 * @author (Julien, Phuc) 
 * @version (2)
 */
public class Level2LoadingScreen extends SimulationWorld
{
    //Sets up a variable for the amount of time since the loading screen started
    private double timeLevel2LoadinScreen = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class Level2LoadingScreen.
     */
    public Level2LoadingScreen()
    {    
        super("LevelsWaitingScreen.wav", 1000, 600);
        showText("THE ROCKET BUNKER", 110, 180, 70, Color.GREEN);
        showText("Help Buck get to the Bunker !", 325, 430, 25, Color.WHITE);
        showText("His rocket awaits to fight the King Alien", 280, 470, 25, Color.WHITE);
        showText("(A) LEFT  (D) RIGHT  (W) JUMP  (SPACE) ENTER", 295, 530, 18, Color.CYAN);
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
          transitionToWorld(new Level2());
        }
    }
}
