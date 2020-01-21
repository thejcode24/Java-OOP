/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author thejcode24
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // TODO code application logic here
        int guessNumber = 0;
        int totalGuesses = 0;
        boolean gameEnd = true;
       
        System.out.println("Guess a number");
        
        int randomNumber = drawNumber();

        while(gameEnd) {
            
            guessNumber = input.nextInt();
            totalGuesses++;


            if(guessNumber == randomNumber) {
                System.out.println("Congratulations, your guess is correct!");
                gameEnd = false;

            }
            else if(guessNumber < randomNumber) {
                System.out.println("The number is greater, guesses made: " + totalGuesses);
            }
            else if(guessNumber > randomNumber) {
                System.out.println("The number is lesser, guesses made: " + totalGuesses);


            }
        }
        
    }
    
}
