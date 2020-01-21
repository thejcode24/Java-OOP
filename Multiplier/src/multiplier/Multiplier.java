/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplier;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class Multiplier {

    /**
     * @param args the command line arguments
     */
    
    private int num;
    
    public Multiplier(int number) {
        this.num = number;
    }
    
    public int multiply(int otherNumber) {
        return otherNumber * num;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Multiplier threeMultiplier = new Multiplier(3);
        
        System.out.println(threeMultiplier.multiply(2));
    }
    
}
