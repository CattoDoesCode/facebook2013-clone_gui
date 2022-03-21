/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.morales.gui;

import java.util.HashMap; // import the HashMap class

/**
 *
 * @author user
 */
public class HelloWorld {
    

    public static void main(String[] args) {
//        System.out.println("Hello, World!"); 
//        HashMap<String,String> map = new HashMap<>();//Creating HashMap   
//        
//        map.put("user", "123");
//        
//        String isp = map.get("user");
//        
//        if (isp.equals("123")) {
//            System.out.println("yep");
//        }
//        else {
//            System.out.println("nope");
//        }
        
        UserAuthentication user = new UserAuthentication();
        UserAuthentication.setSaved_users("bob", "123");

        boolean p = user.log_in("bob", "1234");
               
        
    }
    
}
