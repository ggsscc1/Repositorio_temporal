import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mono extends Actor
{
    
    public void act() 
    {
        move(2);
        World m=getWorld();
        
        if(getX() >= m.getWidth()-20 || getX()<=20)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        if(getY()>=m.getHeight()-20 || getY()<=50)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        Actor Personaje = getOneObjectAtOffset(0,0,Personaje.class);
        if(Personaje!=null)
        {
            Nivel w = (Nivel)getWorld();
            getWorld().removeObject(Personaje);
            w.vidas.decrementar();
            w.life --;
            getWorld().addObject(new Personaje(),50,300);
            
            if(w.vidas.obtenerValor() <= 0)
            {
                GameOver t = new GameOver();
                getWorld().addObject(t,((getWorld().getWidth()/2)),((getWorld().getHeight()/2)));
            }
        }       
    }
}
