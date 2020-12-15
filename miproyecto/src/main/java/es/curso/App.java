import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

package es.curso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola Mundo!" );
        /*logger.log("My Message");*/
    }
    
    public static int doblar (int numero)
    {
        return numero *2;
        
    }
    
    
    public static int mayor (int numero1 , int numero2)
    {
        return numero1>numero2 ? numero1 : numero2;
    }
    
    
     public static int sumar (int numero1 , int numero2)
    {
        return numero1 + numero2;
    }
    
    
    
}
