import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When you win the last level this win screen appears
 * @author (Julien, Phuc) 
 * @version (3)
 */
public class WinScreen extends SimulationWorld
{    
    // Gets the bacground from the world so we can edit the size
    private GreenfootImage background = getBackground();

    /**
     * Constructor for objects of class WinScreen
     */
    public WinScreen()
    {    
        super("winMenu.mp3", 1000, 600);
        showTextWithGreenFont("YOU WIN", 420, 350, 100);
        background.scale(1000, 600);
        prepare();
    }

    /**
     * Shows text on the screen with Green font
     */
    public void showTextWithGreenFont(String message, int x, int y, int size)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(size);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }

    /**
     * Shows text on the screen with White font
     */
    public void showTextWithWhiteFont(String message, int x, int y, int size)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(size);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgainButton playAgainButton = new PlayAgainButton();
        addObject(playAgainButton,499,367);
    }
}
