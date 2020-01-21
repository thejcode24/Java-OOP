/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amountitemsinlist;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class AmountItemsInList {

    /**
     * @param args the command line arguments
     */
    
    public static int countItems(ArrayList<String> list) {
        int count=0;
        for(String item : list) {
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("bye");
        list.add("beer");
        System.out.println(countItems(list));
    }
    
}
