/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icetask3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sushmitha
 */
public class Question1Test {
    
    public Question1Test() {
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
     * Test of isValid method, of class Question1.
     */
    @Test
    public void testIsValid() {
        //test 1
        System.out.println("isValid");
        String s1 = "{}{)}";
        boolean result = Question1.isValid(s1);
        assertFalse(result);
        //test2
        System.out.println("isValid");
        String s2 = "";
        result = Question1.isValid(s2);
        assertFalse(result);
        //test3
        System.out.println("isValid");
        String s3 = "{[}]";
        result = Question1.isValid(s3);
        assertFalse(result);
        //test4
        System.out.println("isValid");
        String s4 = "()";
        result = Question1.isValid(s4);
        assertTrue(result);
        //test4
        System.out.println("isValid");
        String s5 = "({[]})";
        result = Question1.isValid(s5);
        assertTrue(result);
    }
}
