/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prfactorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void factorailEntrada0Salida1() {
        assertEquals(1, Factorial.calcular(0));
    }

    @Test
    public void factorailEntrada1Salida1() {
        assertEquals(1, Factorial.calcular(0));
    }

    @Test
    public void factorailEntrada2Salida1() {
        assertEquals(2, Factorial.calcular(0));
    }
    
    
    
}
