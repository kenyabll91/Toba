package Servlets;

import java.io.Serializable;

public class User implements Serializable { 
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String username;
    private String password;
    
    
    
    public User() {
        firstname = "";
        lastname = "";
        phonenumber = "";
        address = "";
        city = "";
        state = "";
        zipcode = "";
        email = "";
        username = "";
        password = "";
        
    }
    
    public User(String firstname, String lastname, String phonenumber, String address, 
            String city, String state, String zipcode, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.username = lastname + zipcode;
        this.password = "welcome1";
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastName() {
        return lastname;
    }
    
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPhoneNumber() {
        return phonenumber;
    }
    
    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getZipcode() {
        return zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
