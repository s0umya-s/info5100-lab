/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soumyasingh
 */
public class StopState implements State {
    
    @Override
    public void doAction(Context context){
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    
    @Override
    public String toString(){
        return "Stop State";
    }
    
}
