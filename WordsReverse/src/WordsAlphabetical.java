
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thejcode24
 */
public class WordsAlphabetical {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String word = input.nextLine();

            words.add(word);
            Collections.sort(words);

            if (word.equals("")) {
                System.out.println("You typed the following words: ");

                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));

                }
            }

        }

    }

}
