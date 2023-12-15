//Sanzharovskij Bogdan ISD-21    (practice3 ex1)
package lb3;

import java.util.ArrayList;
import java.util.List;

public class Exrs1 {
	
	 public static void main(String[] args) {
	    	int[] list1 = {2, 4, 7, 8, 12, 15, 18, 21, 28, 45, 56};
	        int[] list2 = {4, 8, 11, 15, 19, 20, 23, 28, 37, 56, 81};

	        ArrayList<Integer> result = intersect(list1, list2);

	        System.out.println("Common elements of the two arrays: " + result);
	    }
	 
    public static ArrayList<Integer> intersect(int[] list1, int[] list2) {
        ArrayList<Integer> resultList = new ArrayList<>();   // Створення об'єкту ArrayList для збереження спільних елементів.
        int i = 0;											//Тут Integer вказує, що ми працюємо з списком цілих чисел.
        int j = 0;         
        
        for (; i < list1.length && j < list2.length;) {     //Початок циклу for, який буде виконуватися, доки індекс i менший за довжину list1 і індекс j менший за довжину list2.
            if (list1[i] < list2[j]) {
                i++;
            } else if (list1[i] > list2[j]) {
                j++;
            } else {
                resultList.add(list1[i]);
                i++;
                j++;
            }
        }

        return resultList;
    }

   
}
