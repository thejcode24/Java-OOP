/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestnumber;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class GreatestNumber {

    /**
     * @param args the command line arguments
     */
    public static int greatest(ArrayList<Integer> list) {
        int max = list.get(0);
        for(int i : list) {
            if(i > max) {
                max=i;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(12);
        
        System.out.println(greatest(list));
    }
    
}
