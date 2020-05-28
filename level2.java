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
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("ñ")){
           
                Greenfoot.setWorld(new Level3());
                Menu.lvl++;
            
        }
    
    }
}
