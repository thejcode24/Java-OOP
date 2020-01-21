/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morethanonce;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class MoreThanOnce {

    /**
     * @param args the command line arguments
     */
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int num = list.get(0);
        
        for(int i=1; i<list.size(); i++){
            if(list.get(i)==num) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(input.nextLine());
        
        if(moreThanOnce(list,number)){
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
        
    }
    
}
