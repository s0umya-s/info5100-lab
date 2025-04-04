package assignment_lec8_multithreading;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author soumyasingh
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        FilePlayer fp = new FilePlayer();
//        fp.play("/Users/soumyasingh/Documents/Northeastern University/INFO5100/soumya-singh/Assignment_Lec8_MultiThreading/src/Sounds/do.wav");
    Thread t1 = new Thread1();
    Thread t2 = new Thread2();
    
    t1.start();
    t2.start();
    }
    
}
