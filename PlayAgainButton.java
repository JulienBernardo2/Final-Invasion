import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings player back to main menu
 * @author (Julien, Phuc) 
 * @version (1)
 */
public class PlayAgainButton extends Actor
{
    /**
     * Act - do whatever the PlayAgainButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("PlayAgain_Button_Highlighted.JPG");
        }
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("PlayAgain_Button.JPG");
        }
        if (Greenfoot.mouseClicked(this)) {
            ((SimulationWorld) getWorld()).transitionToWorld(new TitleScreen());
        }   
    }
}
