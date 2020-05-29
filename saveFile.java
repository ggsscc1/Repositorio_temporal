import greenfoot.*; 
//import java.util.Formatter;
import java.io.*;
/**
 * Clase para guardar archivo.
 */
public class saveFile extends Actor
{   
    Nivel w = (Nivel)getWorld();
    // Creamos la variable
    //Formatter archivo = null;
    
    private int h = w.score;
    
    public void manejaArchivo(){
        
           String cadena = Integer.toString(h);
           
            try{
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo.
                File archivo = new File("C:\\Users\\agust\\Downloads\\probar_profe\\archivo_modificado_por_iuresti\\Repositorio_temporal\\archivoScore\\Rtexto.txt");

                FileWriter escribir = new FileWriter(archivo, true);
                    escribir.write("User:  ");  
                    escribir.write(cadena);
                    escribir.write("\r\n");
                escribir.close();
            }catch(Exception e){
                System.out.println("Error al escribir");
            }
    }
    
}