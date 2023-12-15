//Sanzharovskij Bogdan ISD-21      (practice3 ex4)
package lb3;

import java.util.ArrayList;
import java.util.Arrays;

public class Exrs4 {
	
	public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("bread", "oranges", "grapes", "melon", "Strawberries", "pears"));      
        System.out.println("List of words before processing:");
        System.out.println(words);

        removePlurals(words);

        System.out.println("List of words after processing:");
        System.out.println(words);
    }
	
    public static ArrayList<String> removePlurals(ArrayList<String> words) {
        for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            int length = word.length();
            if (length > 0 && word.charAt(length - 1) == 's' || word.charAt(length - 1) == 'S') {
                words.remove(i);            
            } 
        }
        return words;
    }   
}
