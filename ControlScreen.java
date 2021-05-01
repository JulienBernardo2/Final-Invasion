import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This screen explains the controls for the full game
 * @author (Julien, Phuc) 
 * @version (3)
 */
public class ControlScreen extends SimulationWorld
{

    /**
     * Constructor for objects of class ControlScreen
     */
    public ControlScreen()
    {
        super("", 900, 600);
        showText("CONTROLS", 270, 80, 60, Color.GREEN);
        showText("A               LEFT", 200, 200, 40, Color.CYAN);
        showText("D               RIGHT", 200, 270, 40, Color.CYAN);
        showText("W               JUMP", 200, 340, 40, Color.CYAN);
        showText("SPACE      ACTION or SHOOT", 200, 420, 40, Color.CYAN);
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
        addObject(backButton,425,490);
    }
}
