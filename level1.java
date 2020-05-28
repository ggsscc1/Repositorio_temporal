import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/*
 * Escenario numero 1 del juego
 */
public class Level1 extends Nivel
{
    public Level1()
    {    

        prepare();
    }

    public void act(){
       
        
        if(Nivel.score == 5){

            Greenfoot.setWorld(new Level2());
            Menu.lvl++;

        }

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
