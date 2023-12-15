//Sanzharovskij Bogdan ISD-21 (practice2 ex4)
package lb2;
public class exrs4 {
	
	  public static void main(String[] args) {
	        int[] numbers = {45, 16, 16, 23, 27};
	        int result = mode(numbers);

	        if (result != -1) {
	            System.out.println("The most common value is: " + result);
	        } else {
	            System.out.println("The array is empty.");
	        }
	    }

    public static int mode(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        int[] frequency = new int[101]; //Створення масиву frequency розміром 101 для підрахунку частоти кожного числа. 

        for (int i = 0; i < numbers.length; i++) {
            frequency[numbers[i]]++;   //Цикл перебирає всі елементи масиву numbers.
            						   //Для кожного числа у масиві збільшує відповідний лічильник у масиві frequency
        }

        int maxFrequency = 0;   //Ініціалізація змінних для збереження найбільшої частоти
        						//і відповідного значення (моди).
        int modeValue = -1;

        for (int i = 0; i < frequency.length; i++) {    //Цикл перебирає всі елементи масиву frequency
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];       //Умова перевіряє, чи частота поточного числа (frequency[i])
                								   //більша за максимальну частоту (maxFrequency).
                modeValue = i;
            }
        }

        return modeValue;     //Після завершення циклу повертається значення modeValue як результат роботи методу, що відповідає за моду масиву numbers.
        					  //Якщо масив порожній, метод повертає -1.
    }

  
}
