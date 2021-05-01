import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button is to go from the title screen to the Controls screen 
 * @author (Julien, Phuc) 
 * @version (3)
 */
public class ControlButton extends Actor
{   
    /**
     * This is Everything that the Control Button can do
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("Controls_Button_Highlighted.JPG");
        }
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("Controls_Button.JPG");
        }
        if (Greenfoot.mouseClicked(this)) {
            ((SimulationWorld) getWorld()).transitionToWorld(new ControlScreen());
        }
    }    
}
