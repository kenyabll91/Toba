package Servlets;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    public String salt;
    public String passWord;
    public String userName;

    private String firstname;
    private String lastname;
    private String phonenumber;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private long date;

    public User() {
        firstname = "";
        lastname = "";
        phonenumber = "";
        address = "";
        city = "";
        state = "";
        zipcode = "";
        email = "";
        userName = "";
        passWord = "";
        salt = "";
        date = new Date().getTime();

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
        this.userName = userName;
        this.passWord = passWord;
        this.date = date;
        this.salt = "";
    }

    User(String firstname, String lastname, String phonenumber, String address, String city, String state, String zipcode, String email, String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long UserId) {
        this.userId = userId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getCheckingBalance() {
        Account checking = AccountDB.selectAccount(this, "checking");
        if (checking != null)
            return checking.getStartBalance();
        return 0.00;
    }

    public double getSavingsBalance() {
        Account savings = AccountDB.selectAccount(this, "savings");
        if (savings != null)
            return savings.getStartBalance();
        return 0.00;
            
    }
    
    public String getSalt() {
        return salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    public long getDate() {
        return date;
    }
}
