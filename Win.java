import greenfoot.*; 


public class Win extends Actor
{
   
    public Win()
    {
        setImage("Win.png");
        Nivel.score = 0;
        Nivel.life = 3;
        Greenfoot.stop();
    }
    public void act() 
    {
        // Add your action code here.
    } 
}
