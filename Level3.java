import greenfoot.*;  
import java.util.*;

public class Level3 extends Nivel
{

    public Level3()
    { 
    }
    
    public void act(){
        if(Nivel.score == 15){
            //Greenfoot.setWorld(new Level2());
            Win ws = new Win();
            addObject(ws,getWidth()/2,getHeight()/2);
        }

    }
}