import greenfoot.*;  
import java.util.*;

public class Level2 extends Nivel
{
    /**
     * Constructor for objects of class level2.
     * 
     */
    public Level2()
    {    
        prepare();
    }

    public void act(){
        if(Nivel.score == 10){

            Greenfoot.setWorld(new Level3());
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
