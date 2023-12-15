//Sanzharovskij Bogdan ISD-21    (practice3 ex3)
package lb3;

import java.util.ArrayList;
import java.util.Arrays;

public class Exrs3 {
	
	 public static void main(String[] args) {
	        ArrayList<String> words = new ArrayList<>(Arrays.asList("oranges", "Bananas", "grapes", "Strawberries", "pears"));
	        System.out.println("List of words before processing: ");
	        System.out.println(words);

	        capitalizePlurals(words);

	        System.out.println("List of words after processing: ");
	        System.out.println(words);
	    }
	
    public static void capitalizePlurals(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            int wordLength = word.length();
            if (wordLength > 0 && Character.toLowerCase(word.charAt(wordLength - 1)) == 's') {
                String capitalizedWord = word.substring(0, wordLength - 1) + "S";
                words.set(i, capitalizedWord);
            }
        }
    }

   
}
