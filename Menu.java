import greenfoot.*;  


public class Menu extends World
{
    Select s = new Select();
    private int band = 0;
    private int band2 = 0;
    public static int lvl = 0;
    public GreenfootSound musica =  new GreenfootSound("fabrica.wav");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(801, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Start(), 400, 450);
        addObject(new Exit(), 400, 550);
        addObject(s, 100, 450);
        musica.playLoop();

    }
    
    public void act(){
        //Greenfoot.playSound("fabrica.mp3");
       
        if(Greenfoot.isKeyDown("UP") && band != 0){
           band ++; 
        }
        if(Greenfoot.isKeyDown("DOWN") && band != 1){
           band --; 
        }
        
        if(band >= 2){
            band = 0;
        }
        if(band < 0){
            band = 1;
        }
        
        s.setLocation(100, 450 + (band * 100));
        
        if(Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            if(band == 0){
                Greenfoot.setWorld(new Level1());
                musica.stop();
                Menu.lvl ++;
            }
            if(band == 1){
                Greenfoot.stop();
                musica.stop();
            }
        }
        
        
    }
    
   
}
