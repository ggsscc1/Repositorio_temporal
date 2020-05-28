import greenfoot.*;  

public class Cadenas extends Actor
{
    private GreenfootImage imagen;
    private int valorVariable;
    private String mensaje;
    
     /**
     * This method draws the 
     * 
     * @param valorVariable 
     * @param mensaje mensaje que recibe 
     * nombre de la cadena
     * @return 
     */
    public Cadenas(int valorVariable, String mensaje)
    {
        this.valorVariable = valorVariable;
        this.mensaje = mensaje;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("verdana",24));
        dibuja();
    }
    
    /*
     * 
     */
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje + valorVariable, 20, 20);
        setImage(imagen);
    }
    
    public void incrementar()
    {
        valorVariable ++;
        dibuja();
    }
    
    public void decrementar()
    {
        valorVariable --;
        dibuja();
      
    }
    
    public int obtenerValor()
    {
        return valorVariable;
    }
    
    public void act()
    {
    }
}
