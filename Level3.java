import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the level where buck must get to his ship and balst off
 * @author (Julien, Phuc) 
 * @version (6)
 */
public class Level3 extends SimulationWorld
{

    /**
     * Constructor for objects of class Level3
     */
    public Level3()
    {    
        super("Level3.wav", 1000, 700);
        prepare();
    }
    
    /**
     * It creates the objects at start of the world
     */
    private void prepare()
    {
        Platform1 platform1 = new Platform1(200, 25);
        addObject(platform1,232,299);
        platform1.setLocation(103,177);
        Platform1 platform12 = new Platform1(100, 25);
        addObject(platform12,183,629);
        platform12.setLocation(212,624);
        Platform1 platform13 = new Platform1(100, 25);
        addObject(platform13,375,538);
        platform13.setLocation(428,503);
        Platform1 platform14 = new Platform1(100, 25);
        addObject(platform14,672,659);
        platform14.setLocation(612,595);
        Platform1 platform15 = new Platform1(100, 25);
        addObject(platform15,658,341);
        platform15.setLocation(642,385);
        Platform1 platform16 = new Platform1(100, 25);
        addObject(platform16,781,227);
        platform16.setLocation(775,213);
        Platform1 platform17 = new Platform1(100, 25);
        addObject(platform17,495,153);
        platform17.setLocation(491,140);
        Platform1 platform18 = new Platform1(100, 25);
        addObject(platform18,359,282);
        platform18.setLocation(329,282);
        Aliens aliens = new Aliens();
        addObject(aliens,118,267);
        aliens.setLocation(109,402);
        platform17.setLocation(562,169);
        platform17.setLocation(548,179);
        platform17.setLocation(561,145);
        platform13.setLocation(364,563);
        platform13.setLocation(364,550);
        platform18.setLocation(494,424);
        platform14.setLocation(349,212);
        platform17.setLocation(527,189);
        platform15.setLocation(624,348);
        platform16.setLocation(704,261);
        AlienFlipped alienFlipped3 = new AlienFlipped();
        addObject(alienFlipped3,838,308);
        alienFlipped3.setLocation(829,298);
        Aliens aliens2 = new Aliens();
        addObject(aliens2,844,588);
        Rocket2 rocket2 = new Rocket2(90, 150);
        addObject(rocket2,97,90);
        BunkerBuck bunkerBuck = new BunkerBuck();
        addObject(bunkerBuck,74,659);
    }    
}
