import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Level1 extends Nivel
{
    //public Life life;

    
    /**
     * Constructor for objects of class level1.
     * 
     */
    public Level1()
    {    
       
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("p")){
           
                Greenfoot.setWorld(new Level2());
                Menu.lvl++;
            
        }
    
    }
    
    
}
