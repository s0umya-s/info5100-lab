/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author soumyasingh
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker () {
        circle = (Shape) new Circle();
        rectangle = (Shape) new Rectangle();
        square = new Square();
    }
    
    public void drawCircle() {
        circle.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
}
