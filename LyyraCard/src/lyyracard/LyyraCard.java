/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyyracard;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class LyyraCard {

    /**
     * @param args the command line arguments
     */
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical() {
        
    }
    
    public void payGourmet() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LyyraCard card1 = new LyyraCard(50.0);
        
        
        
    }
    
}
