import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world where Buck must reach his bunker
 * @author (Julien, Phuc) 
 * @version (6)
 */
public class Level2 extends SimulationWorld
{
    //Sets up a variable for the amount of time since the loading screen started
    private double timeLevel2 = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class Level2.
     */
    public Level2()
    {    
        super("Level2.wav", 1000, 600); 
        prepare();
    }

    /**
     * It creates the objects at start of the world
     */
    private void prepare()
    {
        AlienFlipped alienFlipped = new AlienFlipped();
        addObject(alienFlipped,654,468);
        alienFlipped.setLocation(668,468);
        removeObject(alienFlipped);
        AlienFlipped alienFlipped2 = new AlienFlipped();
        addObject(alienFlipped2,777,439);
        alienFlipped2.setLocation(772,459);
        alienFlipped2.setLocation(740,450);
        Aliens aliens = new Aliens();
        addObject(aliens,248,56);
        Aliens aliens2 = new Aliens();
        addObject(aliens2,698,164);
        Platform2 platform2 = new Platform2();
        addObject(platform2,337,508);
        platform2.setLocation(228,548);
        Platform2 platform22 = new Platform2(300, 300);
        addObject(platform22,515,506);
        platform22.setLocation(535,480);
        removeObject(platform22);
        Platform2 platform27 = new Platform2(200, 400);
        addObject(platform27,529,504);
        platform22.setLocation(541,411);
        platform2.setLocation(348,535);
        Platform2 platform23 = new Platform2();
        addObject(platform23,149,474);
        platform23.setLocation(123,417);
        Platform2 platform24 = new Platform2();
        addObject(platform24,57,256);
        platform24.setLocation(66,255);
        platform23.setLocation(145,411);
        Platform2 platform25 = new Platform2();
        addObject(platform25,294,174);
        platform25.setLocation(294,123);
        Door door = new Door();
        addObject(door,849,548);
        Buck buck = new Buck();
        addObject(buck,68,556);
    }

    /**
     * We set up a timer for the amount of time left for the world and
     * also transitions to the next screen when the timer is up
     */
    public void act()
    {
        Display display = new Display();
        addObject(display , 500, 15);

        int countDown = (int) ((timeLevel2 + (20 * 1000)) - System.currentTimeMillis())/1000;

        if(countDown<10)
        {
            display.setImage(new GreenfootImage(" Count down 0" + countDown + " " , 24, Color.GREEN, Color.WHITE));
        }
        else
        {
            display.setImage(new GreenfootImage(" Count down " + countDown + " " , 24, Color.GREEN, Color.WHITE));
        }
        
        if (System.currentTimeMillis() >= (timeLevel2 + (30 * 1000)))
        {
            transitionToWorld(new LoseScreen());
        }
    }
}
