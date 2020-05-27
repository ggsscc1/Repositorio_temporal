import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    int speed=5;
    int direction;
    
    /*
     * Funcion Constructor De Disparo
     */
    public Disparo(int direction)
    {
        this.direction=direction;
    }
    
    
    public void act() 
    {
        switch(direction)
        {
            case 0:
                setLocation(getX(),getY()-speed);
            break;
            case 1:
                setLocation(getX(),getY()+speed);
            break;
            case 2:
                setLocation(getX()+speed,getY());
            break;
            case 3:
                setLocation(getX()-speed,getY());
            break;
        }
        Actor Mono = getOneObjectAtOffset(0,0,Mono.class);
        if(Mono!=null)
        {
            Nivel w = (Nivel)getWorld();
            //Level1 w = (Level1)getWorld();
            /*
            switch(Menu.lvl){
                 case 1: level1 w = (level1)getWorld(); break;
                 case 2: level2 w1 = (level2)getWorld(); break;
                 case 3: MyWorld w2 = (MyWorld)getWorld(); break;
                }*/
            getWorld().removeObject(Mono);
            w.puntos.incrementar();
            //Life r = new Life();
            //r.winScore();
         
        }
        

        if((getX() >= getWorld().getWidth()-3) || (getX()<=3))
        {
            getWorld().removeObject(this);
        }else
        {
        if((getY() >= getWorld().getWidth()-3) || (getY()<=3))
        {
            getWorld().removeObject(this);
        }
        }

        

    }    
}
