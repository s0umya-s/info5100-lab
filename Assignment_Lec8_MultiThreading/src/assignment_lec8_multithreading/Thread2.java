/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_lec8_multithreading;

/**Thread 2 will play re, fa, la, do-octave.
 *
 * @author soumyasingh
 */
public class Thread2 extends Thread {
    
    String[] tones = {"re.wav", "fa.wav","la.wav", "do-octave.wav"};
    FilePlayer fp = new FilePlayer();
    
        @Override
    public void run(){
        for (String tone: tones){
            try{
                if(tone.equals("do-octave.wav")){
                    Thread.sleep(1500);
                    fp.play("/Users/soumyasingh/Documents/Northeastern University/INFO5100/soumya-singh/Assignment_Lec8_MultiThreading/src/Sounds/do-octave.wav");
                            Thread.sleep(500);
                }else{
                    Thread.sleep(500);
                fp.play("/Users/soumyasingh/Documents/Northeastern University/INFO5100/soumya-singh/Assignment_Lec8_MultiThreading/src/Sounds/re.wav");
                System.out.println("Thread2: "+tone);
                Thread.sleep(500);
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
