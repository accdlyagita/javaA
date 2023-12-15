//Sanzharovskij Bogdan ISD-21    (practice4 ex2)
package pr4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<CalendarDate> dates = new ArrayList<>(); 		
        //Створюється об'єкт типу ArrayList, який призначений для зберігання об'єктів типу CalendarDate

        dates.add(new CalendarDate(4, 23));
        dates.add(new CalendarDate(1, 15));
        dates.add(new CalendarDate(6, 7));
        dates.add(new CalendarDate(3, 12));
        //Створюється кілька об'єктів CalendarDate з різними датами і додаються до списку dates.

        System.out.println("Не відсортовані дати:");
        for (CalendarDate date : dates) {
            System.out.println(date);
            //Виводяться на екран несортовані дати за допомогою циклу for-each.
        }

        Collections.sort(dates);
        //Використовується статичний метод sort з класу Collections для сортування елементів у списку dates.
        //Оскільки клас CalendarDate імплементує інтерфейс Comparable,
        //то його об'єкти можна автоматично порівнювати та сортувати.

        System.out.println("Відсортовані дати:");
        for (CalendarDate date : dates) {
            System.out.println(date);
        }	//Виводяться на екран відсортовані дати за допомогою циклу for-each.
        	//Після сортування вони виводяться у порядку зростання.
    }	
}
