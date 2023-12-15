//Sanzharovskij Bogdan ISD-21  (practice2 ex1)
package lb2;

public class exrs1 {
	
	 public static void main(String[] args) {
	        int[] numbers = {43, 28, 78, 28, 124, 101, 97, 33};
	        int k = 28;

	        int lastIndex = lastIndexOf(numbers, k); //Виклик методу lastIndexOf з параметрами numbers (масив)
	                                                 //та k (шукане число).

	        if (lastIndex != -1) {
	            System.out.println("The last index of the number " + k + " in array: " + lastIndex);
	        } else {
	            System.out.println("Number " + k + " not found in array.");
	        }
	    }


    public static int lastIndexOf(int[] numbers, int k) { //Цей рядок визначає метод lastIndexOf, 
    	// який приймає масив цілих чисел numbers та шукане число k. 
    	//Метод повертає ціле число (індекс останнього входження k у numbers) або -1, якщо елемент не знайдено.
        int lastIndex = -1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == k) {   //Перевірка, чи поточний елемент масиву numbers дорівнює числу k
                lastIndex = i;       //Якщо умова виконується (numbers[i] == k), то:
                                     //Змінна lastIndex оновлюється значенням поточного індексу i.
                break;
            }
        }

        return lastIndex;  //Повертає значення lastIndex як результат роботи методу. Якщо жодного входження числа
        				   //k у масиві не знайдено, то метод повертає -1.
    }
 }
   
