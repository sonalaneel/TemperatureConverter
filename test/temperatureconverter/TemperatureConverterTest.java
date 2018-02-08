/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sonal
 */
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
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

    /**
     * Test of convertCelciusToFahrenheit method, of class TemperatureConverter.
     */
    @Test
    public void testConvertCelToFah() {
       assertEquals(32.0, TemperatureConverter.convertCelciusToFahrenheit(0.0), 0.001);
       assertEquals(212.0, TemperatureConverter.convertCelciusToFahrenheit(100.0), 0.001);
       assertEquals(33.8, TemperatureConverter.convertCelciusToFahrenheit(1.0), 0.001);
    }

       
    
}
