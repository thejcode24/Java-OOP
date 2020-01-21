/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthstring;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class LengthString {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        
        for(String word : list) {
            lengths.add(word.length());
        }
        return lengths;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<>();
        
        list.add("hello");
        list.add("james jung");
        list.add("pencil");
        list.add("deadpool 2");
        
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println(lengths);
    }
    
}
