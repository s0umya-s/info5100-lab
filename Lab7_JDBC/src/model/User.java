/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author soumyasingh
 */
public class User {
   //data members
//    private int userID;
    private String name;
    private String college;
    private int age;
    private String hobby;
    private ImageIcon picture;
       
    //methods

//    public int getUserID() {
//        return userID;
//    }
//
//    public void setUserID(int userID) {
//        this.userID = userID;
//    }

    
    
    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", college=" + college + ", age=" + age + ", hobby=" + hobby + '}';
    }

//    public int getUserId() {
//        throw new UnsupportedOperationException("user id get - Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

//    public void setUserId(int aInt) {
//        throw new UnsupportedOperationException("user id set - Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public Object getFirstName() {
        throw new UnsupportedOperationException("get first name - Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLastName() {
        throw new UnsupportedOperationException("set last name - Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getUserId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
