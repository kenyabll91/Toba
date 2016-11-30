/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author Kimbreal
 */
public class Account implements Serializable {
    
    public enum accountType{Savings, Checking};
    private Double startBalance;
    private Double runningBalance;
    private Double endBalance;
    private String username;
    private accountType type;
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Transaction> transactions;
    
    public Account() {
        runningBalance = 0.0;
        startBalance = 0.0;
        endBalance = 0.0;
        username = "";
        
    }
    
    public Account(Double startB, String username, accountType accType) {
        this.startBalance = startB;
        this.username = username;
        this.type = accType;
        this.runningBalance = startB;
        transactions = new ArrayList<>();
        
    }
    
    public accountType getAccountType() {
        return type;
    }
    
    public void setAccountType(accountType accType){
        this.type = accType;
    }
    
    public Double getStartBalance(){
        return startBalance;
    }
    
    public void setStartBalance(Double startB){
        this.startBalance = startB;
    }
    
    public Double getEndBalance(){
        return endBalance;
    }
    
    public void setEndBalance(){
        this.endBalance = runningBalance;
    }
    
    public String getUserName(){
        return username;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }
    
    public Double credit(Double cred){
        runningBalance += cred;
        return runningBalance;
    }
    
    public Double debit(Double deb){
        runningBalance -= deb;
        return runningBalance;
    }
    
    public List<Transaction> getTransactions() {
        return transactions;
    }
    
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public void addTransactions(Transaction t) {
        transactions.add(t);
    }
        
   
    
}
