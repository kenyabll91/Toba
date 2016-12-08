/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.Serializable;

/**
 *
 * @author Kimbreal
 */
public class Login implements Serializable {
    private String Username;
    private String Password;
    
    public Login() {
        Username = "";
        Password = "";
    }
    
    public Login(String Usrename, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    
    public String getUsername() {
        return Username;
    }
    
    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
