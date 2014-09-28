import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class far here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dunia extends World
{

    /**
     * Constructor for objects of class far.
     * 
     */
    public dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        //Object Kura pada posisi
        kura k = new kura();
        addObject(k , 41 , 209);
        
        //Posisi Object Bola 1
         bola1 b1 = new bola1();
        addObject(b1 , 292 , 362);
        
        //Posisi Object Bola 2
        bola2 b2 = new bola2();
        addObject(b2 , 359 , 61);
        
        //Object Rumah
        rumah ru = new rumah();
        addObject(ru , 569 , 144);
    }
}
