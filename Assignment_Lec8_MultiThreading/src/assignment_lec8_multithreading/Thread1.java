/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_lec8_multithreading;

/**Thread 1 will play do, mi, sol, si, do-octave
 *
 * @author soumyasingh
 */
public class Thread1 extends Thread {
    
    String[] tones = {"do.wav", "mi.wav","sol.wav","si.wav","do-octave.wav"};
    FilePlayer fp = new FilePlayer();
    
    @Override
    public void run(){
        for (String tone: tones){
            try{
                fp.play("/Users/soumyasingh/Documents/Northeastern University/INFO5100/soumya-singh/Assignment_Lec8_MultiThreading/src/Sounds/do.wav");
                System.out.println("Thread1: "+tone);
                Thread.sleep(500);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
