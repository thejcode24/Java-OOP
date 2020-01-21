/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substringword;

import java.util.Scanner;

/**
 *
 * @author thejcode24
 */
public class SubstringWord {

    /**
     * @param args the command line arguments
     */
    private static void firstPart() {

        Scanner input = new Scanner(System.in);

        System.out.print("Type a word: ");
        String text = input.nextLine();
        System.out.print("Length of the first part: ");
        int flength = input.nextInt();
        String result = text.substring(0, flength);

        System.out.println(result);

    }

    private static void lastPart() {

        Scanner input = new Scanner(System.in);

        System.out.print("Type a word: ");
        String text = input.nextLine();
        System.out.print("Length of the end part: ");
        int elength = input.nextInt();
        String result = text.substring(elength - 1, text.length());

        System.out.println(result);

    }

    private static void wordInWord() {

        Scanner input = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String firstWord = input.nextLine();

        System.out.print("Type the second word: ");
        String secondWord = input.nextLine();

        if (firstWord.indexOf(secondWord) == -1) {
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
        } else {
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
        }

    }

    private static void reverse() {

        Scanner input = new Scanner(System.in);

        String reversedText = "";
        System.out.print("Enter text to reverse: ");
        String text = input.nextLine();

        for (int i = text.length()-1; i >= 0; i--) {
            reversedText += text.charAt(i);

        }

        System.out.println(reversedText);

    }

    public static void main(String[] args) {
        // TODO code application logic here
//        firstPart();
//        lastPart();
//        wordInWord();
        reverse();
    }

}
