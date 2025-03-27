/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author soumyasingh
 */
public class ShapeMakerFacadeTest {
    public ShapeMakerFacadeTest() {
    }
/**
* Test of drawCircle method, of class ShapeMakerFacade.
*/
    @Test
    public void testDrawCircle() {
    System.out.println("drawCircle");
    ShapeMakerFacade instance = new ShapeMakerFacade();
    
    String expResult;
    String result;
    
    // positive
    expResult = "Circle: :draw()";
    result = instance.drawCircle();
    assertEquals(expResult, result);
    
    // negative
    expResult = "Rectangle: :draw()";
    result = instance.drawCircle();
    assertNotEquals(expResult, result);
    
    }
    /**
    * Test of drawRectangle method, of class ShapeMakerFacade.
    */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMakerFacade instance = new ShapeMakerFacade () ;
        
        String expResult;
        String result;
        
        // positive
        expResult = "Rectangle: :draw()";
        result = instance.drawRectangle();
        assertEquals(expResult, result);
        
        // negative
        expResult = "Circle::draw()";
        result = instance.drawRectangle();
        assertNotEquals(expResult, result);
    }
}
