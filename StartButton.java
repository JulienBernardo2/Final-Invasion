import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button is to go from the title screen to Start the game in the tutorial world
 * @author (Julien, Phuc) 
 * @version (3)
 */
public class StartButton extends Actor
{       
    /**
     * This is Everything that the Start Button can do
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Start_Button_Highlighted.JPG");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Start_Button.JPG");
        }
        if (Greenfoot.mouseClicked(this))
        {            
            ((SimulationWorld) getWorld()).transitionToWorld(new Level1LoadingScreen());
        }
    }         
}
