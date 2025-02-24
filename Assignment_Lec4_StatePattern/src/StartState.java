/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soumyasingh
 */
public class StartState implements State {
    
    @Override
    public void doAction(Context context){
        System.out.println("Player is in start state");
        context.setState(this);
    }
    
    @Override
    public String toString(){
        return "Start State";
    }
    
}
