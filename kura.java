import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kura extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
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
                left ();
            }else{
                right();
            }
        }else{
                
            if (getRotation()==0)
            {
                right();
            }else{
                left();
            }
        }
    }
    
    private void right()
    {
        setLocation(getX()+5,getY());
    }
    
    private void left()
    {
        setLocation(getX()-5,getY());
    }
}

