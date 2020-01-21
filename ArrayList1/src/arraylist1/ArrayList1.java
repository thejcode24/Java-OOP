/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;
import java.util.*;
/**
 *
 * @author thejcode24
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> words = new ArrayList<String>();
        
        while(true) {
            
            System.out.println("Type a word: ");
            String word = input.nextLine();
            words.add(word);
            
            if(word.equals("")) {
                System.out.println("You typed the following words:");
                
                int place = 0;
                while(place < words.size()) {
                    System.out.println(words.get(place));
                    place++;
                    
                }
                break;
            }
            
        }

    }
}