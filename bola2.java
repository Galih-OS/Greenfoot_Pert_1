import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola2 extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (isAtEdge())
        {
            turn(180);
            if (getRotation()==180)
            {
                up ();
            }else{
                down();
            }
        }else{
                
            if (getRotation()==0)
            {
                down();
            }else{
                up();
            }
        }
    }
    
    private void down()
    {
        setLocation(getX(),getY()+3);
    }
    
    private void up()
    {
        setLocation(getX(),getY()-3);
    }
}