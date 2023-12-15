//Sanzharovskij Bogdan ISD-21   (practice3 ex2)
package lb3;

import java.util.ArrayList;
import java.util.Collections;

public class Exrs2 {
	
	public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");

        System.out.println("List before flipping: ");
        System.out.println(strings);

        reverse(strings);

        System.out.println("List after flipping: ");
        System.out.println(strings);
    }
	
    public static void reverse(ArrayList<String> list) {
        Collections.reverse(list);
    }

    
}
