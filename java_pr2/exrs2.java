//Sanzharovskij Bogdan ISD-21 (practice2 ex2)
package lb2;
import java.util.Arrays;

public class exrs2 {
	
	public static void main(String[] args) {
        int[] numbers = {76, 12, 89, 12, 115, 12, 56};
        int k = 12;

        int[] indexes = allIndexesOf(numbers, k); //Виклик методу allIndexesOf для знаходження всіх індексів числа k у масиві numbers

        if (indexes != null) {
            System.out.println("Number indices " + k + "in array: " + Arrays.toString(indexes));
        } else {
            System.out.println("Number " + k + " not found in the array.");
        }
    }

    public static int[] allIndexesOf(int[] numbers, int k) { //Цей метод allIndexesOf призначений для знаходження всіх індексів,
    	                                                     //де вказане число k входить у масив numbers
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {  //Умова if (numbers[i] == k) перевіряє, чи поточний елемент рівний числу k
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        int[] indexes = new int[count];
        int currentIndex = 0;    //  використовуватиметься для визначення поточного індексу у масиві indexes.

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {         //Умова if (numbers[i] == k) перевіряє, чи поточний елемент рівний числу k
                indexes[currentIndex] = i; //Якщо умова виконується, поточний індекс i додається до масиву indexes,
                                           //і currentIndex збільшується на 1.
                currentIndex++;
            }
        }

        return indexes; //Після того, як масив indexes заповнений усіма індексами числа k,
        // він повертається як результат роботи методу.
    }

    
}
