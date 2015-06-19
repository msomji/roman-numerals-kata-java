/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for the calculator class
 * @author maisamsomji
 */
public class ConverterTest {
    
    public ConverterTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testToRomanWithNumber1() {
        System.out.println("Toroman method converts 1 to 'I'");
        int x = 1;
        Converter instance = new Converter();
        String expResult = "I";
        String result = instance.toRoman(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToRomanWithNumberTwo() {
        System.out.println("Toroman method converts 2 to 'II'");
        Converter instance = new Converter();
        assertEquals("II", instance.toRoman(2));
    }
    @Test
    public void testToRomanWithNumberThree(){
        System.out.println("ToRoman menthod converts 3 to III");
        Converter instance = new Converter();
        assertEquals("III", instance.toRoman(3));
    }
    @Test 
    public void testToRomanwithNumberFour(){
        System.out.println("Converts 4 to 'IV'");
        Converter instance = new Converter();
        assertEquals("IV", instance.toRoman(4));
    }
    @Test
    public void testToRomanwithNumberfive(){
        System.out.println("Converts 5 to 'V'");
        Converter instance = new Converter();
        assertEquals("V", instance.toRoman(5));
    }
    @Test
    public void testToRomanwithNumberfourtyfive(){
        System.out.println("Converts 45 to 'XLV'");
        Converter instance = new Converter();
        assertEquals("XLV", instance.toRoman(45));
    }
    
}