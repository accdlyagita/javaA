//Санжаровський Богдан ІСД-21  (practice 1)
package lb1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the first value: ");
        Scanner scanner = new Scanner(System.in);     // Створює об'єкт класу Scanner для отримання введених даних від користувача.
        int number1 = scanner.nextInt();
        System.out.println("Enter the second value: ");
        int number2 = scanner.nextInt();

        int count = number2 - number1 + 1;

        System.out.print("Task a)");
        int[] array1 = new int[count];
        for (int i = 0; i < count; i++) {
            array1[i] = number1 + i;    //Цикл for заповнює масив числами від number1 до number2:
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Total count: " + count);
        System.out.println();

        System.out.print("Task b)");
        int nnumber = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] % 2 != 0) {
                nnumber++;
            }
        }
        int[] array2 = new int[nnumber];
        int array2Index = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] % 2 != 0) {
                array2[array2Index] = array1[i];
                array2Index++;
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("Number of odd numbers: " + nnumber);
        System.out.println();

        System.out.print("Task c)");
        int pnumber = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] % 2 == 0) {
                pnumber++;
            }
        }
        int[] array3 = new int[pnumber];
        int array3Index = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] % 2 == 0) {
                array3[array3Index] = array1[i];
                array3Index++;
            }
        }
        System.out.println(Arrays.toString(array3));
        System.out.println("Number of even numbers: " + pnumber);
        System.out.println();

        System.out.print("Task d)");
        int vnumber = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] < 0) {
                vnumber++;
            }
        }
        int[] array4 = new int[vnumber];
        int array4Index = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] < 0) {
                array4[array4Index] = array1[i];
                array4Index ++;
            }
        }

        if (vnumber == 0) {
            System.out.println("No negative numbers");
        } else {
            System.out.println(Arrays.toString(array4));
            System.out.println("Number of negative numbers: " + vnumber);
        }
        System.out.println();

        System.out.print("Task e)");
        int dnumber = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] >= 0) {
                dnumber++;
            }
        }
        int[] array5 = new int[dnumber];
        int array5Index = 0;
        for (int i = 0; i < count; i++) {
            if (array1[i] >= 0) {
                array5[array5Index] = array1[i];
                array5Index ++;
            }
        }

        if (dnumber == 0) {
            System.out.println("No positive numbers");
        } else {
            System.out.println(Arrays.toString(array5));
            System.out.println("Number of positive numbers: " + dnumber);
        }
    }
}
