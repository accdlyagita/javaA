//Sanzharovskij Bogdan ISD-21 (practice2 ex3)
package lb2;
public class exrs3 {
	
	public static void main(String[] args) {
        double[] list1 = {1.0, 2.0, 2.5, 3.0, 4.0};
        double[] list2 = {3.0, 1.0, 4.0, 2.0};
        double[] list3 = {};

        System.out.println("Is it sorted list 1 ? " + isSorted(list1));
        System.out.println("Is it sorted list 2 ? " + isSorted(list2));
        System.out.println("Is it sorted list 3 ? " + isSorted(list3));
    }

    public static boolean isSorted(double[] arr) {  //Цей рядок визначає метод isSorted, який приймає масив arr дійсних чисел
    												//і повертає значення типу boolean
        int length = arr.length;

        if (length <= 1) {   //Якщо довжина масиву менша або дорівнює 1, то вважаємо масив відсортованим,
        	                 //оскільки у нього немає елементів або всього один елемент.
            return false; 
        }

        for (int i = 1; i < length; i++) {
            if (arr[i] < arr[i - 1]) {  //Порівнює поточний елемент arr[i] з попереднім елементом arr[i - 1].
            							//Якщо поточний елемент менший за попередній, то масив не відсортований, і метод повертає false
                return false; 
            }
        }

        return true; 
    }

    
}
//В наведеному вами фрагменті коду масив arr передається як параметр методу isSorted. В методі main, де викликається цей метод, масиви sortedArray, unsortedArray, і emptyArray є прикладами того, як можна передати масив arr в метод isSorted.
//У кожному виклику методу isSorted, відповідний масив передається як аргумент. Наприклад, isSorted(sortedArray) передає в метод isSorted масив sortedArray.
//Таким чином, arr у методі isSorted представляє собою масив, який ви передаєте при виклику методу. У кожному конкретному виклику методу isSorted, arr приймає значення вказаного масиву.





