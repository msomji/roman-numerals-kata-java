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
 * Unit test of Converter
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
     * Test of toRoman method, of class Converter.
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
    @Test
    public void testToRomanWithNumberThirtyNine(){
        System.out.println("Converts 39 to 'XXXIX'");
        Converter instance = new Converter();
        assertEquals("XXXIX", instance.toRoman(39));
    }
    @Test
    public void testToRomanWithNumberThreeHunderedSeventyTwo(){
        System.out.println("Converts 372 to 'CCCLXXII'");
        Converter instance = new Converter();
        assertEquals("CCCLXXII", instance.toRoman(372));
    }
    @Test
    public void testToRomanWithNumer1066(){
        System.out.println("Converts 1066 to 'MLXVI'");
        Converter instance = new Converter();
        assertEquals("MLXVI", instance.toRoman(1066));
    }
    @Test
    public void testToRomanWithNumer1989(){
        System.out.println("Converts 1989 to 'MCMLXXXIX'");
        Converter instance = new Converter();
        assertEquals("MCMLXXXIX", instance.toRoman(1989));
    }
    
      /**
     * Test of toArabic method, of class Converter.
     */
    @Test
    public void testToArabicWithNumber1() {
        System.out.println("toArabic method converts 'I' to 1");
        Converter instance = new Converter();
        assertEquals(1, instance.toArabic("I"));
    }
    @Test
    public void testToArabicWithNumber5() {
        System.out.println("toArabic method converts 'V' to 5");
        Converter instance = new Converter();
        assertEquals(5, instance.toArabic("V"));
    }
    @Test
    public void testToArabicWithNumberTwo() {
        System.out.println("toArabic method converts 'II' to 2");
        Converter instance = new Converter();
        assertEquals(2, instance.toArabic("II"));
    }
    @Test
    public void testToArabicWithNumber3() {
        System.out.println("toArabic method converts 'III' to 3");
        Converter instance = new Converter();
        assertEquals(3, instance.toArabic("III"));
    }
    @Test
    public void testToArabicWithNumber4() {
        System.out.println("toArabic method converts 'IV' to 4");
        Converter instance = new Converter();
        assertEquals(4, instance.toArabic("IV"));
    }
    @Test
    public void testToArabicWithNumber9() {
        System.out.println("toArabic method converts 'IX' to 9");
        Converter instance = new Converter();
        assertEquals(9, instance.toArabic("IX"));
    }
        
    
//   @Test
//    public void testToArabicWithNumber45() {
//        System.out.println("toArabic method converts 'XLV' to 45");
//        Converter instance = new Converter();
//        assertEquals(45, instance.toArabic("XLV"));
//    }
//    @Test
//    public void testToArabicWithNumber39() {
//        System.out.println("toArabic method converts 'XXXIX' to 39");
//        Converter instance = new Converter();
//        assertEquals(39, instance.toArabic("XXXIX"));
//        }

}