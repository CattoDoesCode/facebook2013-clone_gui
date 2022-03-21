
package com.morales.gui;

import java.util.HashMap;

/**
 *
 * @author CattoDoesCode
 */
public class User {
    
    private static final HashMap<String, String> saved_users = new HashMap<>();
    
    private String firstName;
    private String lastName;
    private String email;
    private String re_email;
    private String pass;
    private String month;
    private String day;
    private String year;
    private String sex;
    
    // constructor
    public User() {
        saved_users.put("user", "123");
        saved_users.put("admin", "admin123");
    }
   
    // <editor-fold defaultstate="collapsed" desc="getter and setter">  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRe_email() {
        return re_email;
    }

    public void setRe_email(String re_email) {
        this.re_email = re_email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public static void setSaved_users(String u_name, String u_pass) {
        User.saved_users.put(u_name, u_pass);
    }
    
    public static HashMap<String, String> getSaved_users() {
        return saved_users;
    }
    
    // </editor-fold>
    
    
    // checker
    public static boolean check_user(String u_name) {        
        return saved_users.containsKey(u_name);
    }
    public static boolean check_pass(String u_name, String u_pass) {
        return saved_users.get(u_name).equals(u_pass);
    }
    
} 
