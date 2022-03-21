
package com.morales.gui;

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
    
}
