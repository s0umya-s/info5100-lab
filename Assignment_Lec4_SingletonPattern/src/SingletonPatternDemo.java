/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soumyasingh
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }   
}
