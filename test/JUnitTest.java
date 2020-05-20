/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author arman
 */
public class JUnitTest {
    
    @Test
    public void testsuma(){
        int resultado = Calculadora.sumar(2000, 3000000);
        int esperado = 3002000;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testsuma2(){
        int resultado = Calculadora.sumar(2, 3);
        int esperado = 6;
        assertNotEquals(esperado, resultado);
    }
    
    @Test
    public void testresta(){
        int resultado = Calculadora.restar(5, 2);
        int esperado = 3;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testresta2(){
        int resultado = Calculadora.restar(5, 2);
        int esperado = 1;
        assertNotEquals(esperado, resultado);
    }
    
    @Test
    public void testmultiplicacion(){
        int resultado = Calculadora.multiplicar(5, 2);
        int esperado = 10;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testmultiplicacion2(){
        int resultado = Calculadora.multiplicar(5, 2);
        int esperado = 15;
        assertNotEquals(esperado, resultado);
    }
    @Test
    public void testdividir(){
        int resultado = Calculadora.dividir(6, 2);
        int esperado = 3;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testdividir2(){
        int resultado = Calculadora.dividir(6, 2);
        int esperado = 210;
        assertNotEquals(esperado, resultado);
    }
    
}
