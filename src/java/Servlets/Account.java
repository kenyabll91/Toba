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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author Kimbreal
 */
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long accountID;
    private String accountType;
    private Double startBalance;
    private User user;
    
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Transaction> transactions;
    
    public Account() {
        accountType="";
        startBalance = 0.0;
        user = new User();
        
    }
    
    public Account(String accntType, double startingBal, User acctOwner) {
        accountType = accntType;
        this.startBalance = startingBal;
        user = acctOwner;
        transactions = new ArrayList<>();
        
    }
  
    public Double credit(Double credit){
        startBalance = startBalance + credit;
        return startBalance;
    }
    
    public Double debit(Double debit){
        startBalance = startBalance  - debit;
        return startBalance;
    }
    
    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
 
    public Double getStartBalance(){
        return startBalance;
    }
    
    public void setStartBalance(Double startB){
        this.startBalance = startB;
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
