//Sanzharovskij Bogdan ISD-21  (practice2 ex5)
package lb2;
public class exrs5 {
	
	public static void main(String[] args) {
        int[] numbers = {5, 4, 2, 11, 9, 10, 4, 7, 3};
        evenBeforeOdd(numbers);

        System.out.println("Array after rearrangement: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void evenBeforeOdd(int[] numbers) {
        int evenIndex = 0;
        int oddIndex = numbers.length - 1;  //Створення змінної oddIndex індексу для непарних елементів,
        									//яка ініціалізується значенням numbers.length - 1, тобто останній елемент масиву.

        while (evenIndex < oddIndex) {   		//Цикл while, який виконується, доки evenIndex менше за oddIndex.
        										//Це гарантує, що обміни відбуваються тільки до тих пір, доки не вийде за межі середини масиву.
            if (numbers[evenIndex] % 2 == 0) {  
                evenIndex++;					//Умова перевіряє, чи поточний елемент з індексом evenIndex парний. Якщо так, то збільшуємо evenIndex. Це робиться для того,
                								//щоб перейти до наступного парного елемента, оскільки він вже знаходиться на своєму місці.
            } else {
               
                int temp = numbers[evenIndex];
                numbers[evenIndex] = numbers[oddIndex];				//Якщо поточний елемент непарний, виконується обмін між парним і непарним елементами.
                numbers[oddIndex] = temp;							//Використовується тимчасова змінна temp для збереження значення елемента на позиції evenIndex, після чого виконується обмін значень між елементами на позиціях evenIndex і oddIndex.
                oddIndex--;											//Після обміну значень зменшується oddIndex, оскільки ми тепер маємо один непарний елемент менше.
                													//Цей процес триває до тих пір, поки evenIndex не дорівнює або не стане більше oddIndex. Після виклику цього методу парні елементи в масиві будуть розташовані перед непарними.
                
                						
            }
        }
    }
    
}

