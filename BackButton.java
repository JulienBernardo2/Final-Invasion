import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button is to go back to the title screen
 * from the story or controls screen
 * @author (Julien, Phuc) 
 * @version (1)
 */
public class BackButton extends Actor
{
    /**
     * This is Everything that the Back Button can do
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("Back_Button_Highlighted.JPG");
        }
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("Back_Button.JPG");
        }
        if (Greenfoot.mouseClicked(this)) {
            ((SimulationWorld) getWorld()).transitionToWorld(new TitleScreen());
        }
    }    
}
