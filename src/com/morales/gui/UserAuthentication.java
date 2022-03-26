
package com.morales.gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author CattoDoesCode
 */
public class UserAuthentication extends User{
    
    
    public boolean log_in(String u_name, String u_pass) {
        
        if (!check_user(u_name)) {
            System.out.println("user not found!");
            return false;
        }
        else if (!check_pass(u_name, u_pass)) {
            System.out.println("incorrect password");
            return false;
        }
        else {
            System.out.println("log in successful");
            return true;
        }

    } 
    
    public void sign_up(String fName, String lName, String em, String r_em, String pass, String mon, String day, String year, String sex) {
        setFirstName(fName);
        setLastName(lName);
        setEmail(em);
        setRe_email(r_em);
        setPass(pass);
        setMonth(mon);
        setDay(day);
        setYear(year);
        setSex(sex);
        
        setSaved_users(em, pass);
    }
    
    public void forgot_password() {
        // TODO: code forgot password method
    }
    
    public boolean there_is_upper_lower(String p) {
        boolean there_is_upper = false;
        boolean there_is_lower = false;

        Pattern upper_pattern = Pattern.compile("[A-Z]");
        Matcher upper_matcher = upper_pattern.matcher(p);
        there_is_upper = upper_matcher.find();

        Pattern lower_pattern = Pattern.compile("[a-z]");
        Matcher lower_matcher = lower_pattern.matcher(p);
        there_is_lower = lower_matcher.find();

        return (there_is_upper && there_is_lower);
    }
    
    public boolean there_is_letter_number(String p) {
        boolean there_is_letter = false;
        boolean there_is_number = false;
        
        Pattern letter_pattern = Pattern.compile("[A-Z]", Pattern.CASE_INSENSITIVE);
        Matcher letter_matcher = letter_pattern.matcher(p);
        there_is_letter = letter_matcher.find();
        
        Pattern number_pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher number_matcher = number_pattern.matcher(p);
        there_is_number = number_matcher.find();
        
        return (there_is_letter && there_is_number);
    }
    
    public boolean there_is_specialChar (String p) {
        boolean there_is_specialChar = false;
        
        Pattern pattern = Pattern.compile("[\\\"!@#$%^&*()-+?_=,<>/\\\"]");
        Matcher matcher = pattern.matcher(p);
        there_is_specialChar = matcher.find();
        
        return there_is_specialChar;
        
    }
    
    public boolean isStrongPassword(String pass) {
        return ((pass.length() >= 8) && there_is_upper_lower(pass) && there_is_letter_number(pass) && there_is_specialChar(pass));
    }
    
}
