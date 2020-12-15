package es.curso;

import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

/**
 * Hello world!
 *
 */
public class App 

{
    private static final  Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
                
    public static void main( String[] args )
    {
        System.out.println( "Hola Mundo!" );
        LOGGER.log(Level.INFO, "Hola Mundo pero en el log");
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
