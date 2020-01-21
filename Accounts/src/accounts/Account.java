/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author thejcode24
 */
public class Account {
    
    private String name;
    private double balance;
   
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdrawal(double amount) {
        balance -= amount;
    }
    
    public double balance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return name + " balance: "+ balance;
    }
}
