/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

import java.util.*;

/**
 *
 * @author thejcode24
 */
public class ArrayList2 {

    /**
     * Recurring word - get user input until same word is input twice
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String word = input.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " already");
                break;
            } else {
                words.add(word);
                
            }
        }

    }

}
