import greenfoot.*; 
import java.util.Formatter;
import java.io.*;
/**
 * Clase para guardar archivo.
 */
public class saveFile extends Actor
{   
    // Creamos la variable
    Formatter archivo = null;
    /**
     * Act realiza la escritura de archivo
     */
    /*
    public void act() 
    {
        Nivel score = new Nivel();
        try{
            archivo = new Formatter("C:\\Users\\agust\\Downloads\\probar_profe\\archivo_modificado_por_iuresti\\Repositorio_temporal\\archivoScore\\archivo.txt");
            archivo.format("%d %s", score.score, "Roberto");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }finally{
          archivo.close();   
        }
    }*/
    /*
    public void act2(){
        String texto;
        try{
            FileReader fr = new FileReader("archivo2.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
    }
    *//*
    public void act3(){
        String texto = "Mi texto en el archivo";
        try{
            PrintWriter("miarchivo.txt");
            pw.println(texto);
            pw.close();
        }catch(Exception err){
            
        }
    }*/
}
