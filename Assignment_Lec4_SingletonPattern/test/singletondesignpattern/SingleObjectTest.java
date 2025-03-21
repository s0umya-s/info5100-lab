/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package singletondesignpattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author soumyasingh
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }

    /**
     * Test of getInstance method, of class SingleObject.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of showMessage method, of class SingleObject.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        
        SingleObject so = SingleObject.getInstance();
        
        //positive test case
        String expResult = "Hello Singleton World";
        String result = so.showMessage();
        assertEquals(expResult, result);
        
        //negative text case
        expResult = "Hello World!";
        result = so.showMessage();
        assertNotEquals(expResult, result);
    }
}
