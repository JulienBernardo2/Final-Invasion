import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button is to go from the title screen to the Story screen 
 * @author (Julien, Phuc) 
 * @version (1).
 */
public class TrainingButton extends Actor
{
    /**
     * This is Everything that the Training Button can do
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Training_Button_Highlighted.JPG");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Training_Button.JPG");
        }
        if (Greenfoot.mouseClicked(this))
        {  
            ((SimulationWorld) getWorld()).transitionToWorld(new Tutorial());
        }
    }
}
