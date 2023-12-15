//Sanzharovskij Bogdan ISD-21    (practice3 ex4)  
package lb3;      

import java.util.ArrayList;
import java.util.Arrays;

public class Exrs4n {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("worldS", "dog", "cats", "school", "moon", "sun", "clouds"));
        System.out.println("Input: " + words);
        System.out.println("Result: " + removePlurals(words));

    }

    public static ArrayList<String> removePlurals(ArrayList<String> words) {
        int i = 0;
        while (i != words.size()) {
            String word = words.get(i);
            if (Character.toLowerCase(word.charAt(word.length() - 1)) == 's') {
                words.remove(word);
                i = 0;
            }
            i += 1;
        }

        return words;
    }
}