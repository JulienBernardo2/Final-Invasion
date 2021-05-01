import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * This World is meant to control the music tansitions between worlds.
 * @author (Julien, Phuc) 
 * @version (6)
 */
public class SimulationWorld extends World
{
    public GreenfootSound music;
    
    public SimulationWorld(String musicFile, int windowWidth, int windowHeight)
    {    
        super(windowWidth, windowHeight, 1, false); 
        
        if (musicFile != null && musicFile.isEmpty() == false)
        {
            music = new GreenfootSound(musicFile);
        }
    }
    
    
    public void started()
    {
        
        if (music != null)
        {
            music.playLoop();
        }
    }

    public void stopped()
    {
        if (music != null)
        {
            music.pause();
        }        
    }
    
    public GreenfootSound getMusic()
    {
        return music;
    }
    
    public void setMusic(GreenfootSound newMusic)
    {
        // If the music is playing, stop the current music
        if (music != null && music.isPlaying() == true)
        {
            music.stop();
            newMusic.playLoop();
        }
        
        music = newMusic;
    } 
    
    public void transitionToWorld(SimulationWorld newWorld)
    {
        stopped();
        Greenfoot.setWorld(newWorld);
        if (newWorld.getMusic() == null)
        {
            newWorld.setMusic(music);
        }       
        newWorld.started();
    }
    
}