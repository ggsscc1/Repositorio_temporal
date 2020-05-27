import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Nivel
{
    /**
     * Constructor for objects of class level2.
     * 
     */
    public Level2()
    {    
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("ñ")){
           
                Greenfoot.setWorld(new Level3());
                Menu.lvl++;
            
        }
    
    }
}
