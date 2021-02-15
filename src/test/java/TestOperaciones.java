/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.laboratorio.OperarNumeros;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author victorjoab
 */
public class TestOperaciones {
    
    OperarNumeros operaciones = new OperarNumeros();
    
    public TestOperaciones() {
        
    }


    @BeforeClass
    public void setUpClass() throws Exception {
        operaciones.setNumero1("10");
        operaciones.setNumero2("5");
    }
    
    //Probando el metodo de suma    
    @Test
    public void testCalcularSuma(){
        operaciones.suma();      
        Assert.assertEquals(operaciones.getResultado(), 15);
    }
    
    //Probando el metodo de resta    
    @Test
    public void testCalcularResta(){
         operaciones.resta();      
        Assert.assertEquals(operaciones.getResultado(), 5);
    }
    
    //Probando el metodo de multiplicacion    
    @Test
    public void testCalcularMultiplicacion(){
        operaciones.multiplicacion();      
        Assert.assertEquals(operaciones.getResultado(), 50);
    } 
    
    
    //Probando el metodo de division    
    @Test
    public void testCalcularDivision(){
        operaciones.division();      
        Assert.assertEquals(operaciones.getResultado(), 2);
    }

}
