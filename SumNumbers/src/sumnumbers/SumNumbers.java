/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumbers;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class SumNumbers {

    /**
     * @param args the command line arguments
     */
    public static int sum(ArrayList<Integer> list) {
        int total=0;
        for(int i : list) {
            total+=i;
        }
        return total;
    }
     
    public static double average(ArrayList<Double> avg) {
        int total=0;
        for(double i : avg) {
            total+=i;
        }
        return total/avg.size();       
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Double> avg = new ArrayList<Double>();
        list.add(4);
        list.add(3);
        list.add(9);
        
        avg.add(3.0);
        avg.add(2.0);
        avg.add(5.0);
        avg.add(8.0);
        avg.add(2.0);
        
        System.out.println(sum(list));
        System.out.println(average(avg));
        
    }
    
}
