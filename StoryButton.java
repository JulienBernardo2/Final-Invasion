import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button is to go from the title screen to the Story screen 
 * @author (Julien, Phuc) 
 * @version (1)
 */
public class StoryButton extends Actor
{    
   
    /**
     * This is Everything that the Story Button can do
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Story_Button_Highlighted.JPG");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Story_Button.JPG");
        }
        if (Greenfoot.mouseClicked(this))
        {  
            ((SimulationWorld) getWorld()).transitionToWorld(new StoryScreen());
        }
    }

      
}
