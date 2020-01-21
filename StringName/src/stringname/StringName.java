/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringname;
import java.util.Scanner;

/**
 *
 * @author thejcode24
 */
public class StringName {

    /**
     * @param args the command line arguments
     */
    
    private static int calculateCharacters(String text) {
        int lengthString;
        
        lengthString = text.length();
        return lengthString;
    }
    
    private static char firstLetter(String text) {
        char first = text.charAt(0);
        return first;
    }
    
    private static char lastLetter(String text) {
        int lengthString = text.length();
        char last = text.charAt(lengthString-1);
        return last;
    }
    
    private static void separateLetters(String text){
        for(int i=0; i<text.length(); i++) {
            System.out.println(i+ ": "+ text.charAt(i));
        }
        
    }
    
    private static void reverseString(String text) {
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int lengthString = 0;
        char firstLetter;
        char lastLetter;
                
        System.out.println("Type your name: ");
        String name = input.nextLine();
        
        lengthString = calculateCharacters(name);
        firstLetter = firstLetter(name);
        lastLetter = lastLetter(name);
        
        System.out.println("Number of characters: " + lengthString);
        System.out.println("First letter: " + firstLetter);
        System.out.println("Last letter: " + lastLetter);

        separateLetters(name);
        reverseString(name);

        
    }
    
}
