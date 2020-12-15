package es.curso;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.Assert;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
   @Test
    public void pruebaDoblar()
    {
        int resultado=App.doblar(5);
        assertEquals(resultado,10);
    }
    
   @Test
    public void pruebaDoblarNegativo()
    {
        int resultado=App.doblar(-5);
        assertEquals(resultado,-10);
    }    
    
   @Test
    public void pruebaDoblarCero()
    {
        int resultado=App.doblar(0);
        assertEquals(resultado,0);
    }       
    
  
    
  @Test
    public void pruebaMayor1()
    {
        int resultado=App.mayor(2,0);
        assertEquals(resultado,2);
    }       

  @Test
    public void pruebaMayor2()
    {
        int resultado=App.mayor(0,5);
        assertEquals(resultado,5);
    }      
        
  @Test
    public void pruebaMayorNegativo()
    {
        int resultado=App.mayor(0,-5);
        assertEquals(resultado,0);
    }          

@Test
    public void pruebaSumarNegativo()
    {
        int resultado=App.sumar(0,-5);
        assertEquals(resultado,-5);
    }      
@Test        
    public void pruebaSumarMal()
    {
        int resultado=App.sumar(1,2);
        assertEquals(resultado,2);
    }              
        

}
