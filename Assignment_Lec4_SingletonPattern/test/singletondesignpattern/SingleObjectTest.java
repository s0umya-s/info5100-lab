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
 * Unit tests for the SingleObject class which implements the Singleton design pattern.
 * These tests verify that only one instance of the class exists and that
 * the message returned from the instance is as expected.
 * 
 * @author soumyasingh
 */
public class SingleObjectTest {

    public SingleObjectTest() {
    }

    /**
     * Tests that multiple calls to getInstance() return the same object reference,
     * validating the Singleton behavior of the SingleObject class.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        assertEquals(expResult, result); // Should return same instance
    }

    /**
     * Tests the showMessage() method of the SingleObject class.
     * 
     * Verifies that the message returned is consistent with expectations:
     * - Positive case checks for the correct singleton message.
     * - Negative case ensures incorrect strings are not returned.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        
        SingleObject so = SingleObject.getInstance();
        
        // Positive test case: Expected correct message
        String expResult = "Hello Singleton World";
        String result = so.showMessage();
        assertEquals(expResult, result);
        
        // Negative test case: Expected different string
        expResult = "Hello World!";
        result = so.showMessage();
        assertNotEquals(expResult, result);
    }
}