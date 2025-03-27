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
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;
    
    public ShapeMaker () {
        circle = (Shape) new Circle();
        rectangle = (Shape) new Rectangle();
        square = new Square();
    }
    
    public String drawCircle() {
        circle.draw();
        return "Circle: :draw()";
    }
    
    public String drawRectangle(){
        rectangle.draw();
        return "Rectangle: :draw()";
    }
    
    public void drawSquare(){
        square.draw();
    }
}
