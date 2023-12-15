//Sanzharovskij Bogdan ISD-21    (practice4 ex1)
package pr4;

public class CalendarDate implements Comparable<CalendarDate> {   //Визначення класу CalendarDate, який імплементує інтерфейс Comparable.
																  //Це означає, що об'єкти цього класу можуть бути порівнюваними між собою.
	private int month;
    private int day;

    public CalendarDate(int month, int day) {    //Конструктор класу, який приймає значення для місяця і дня.
        if (isValidDate(month, day)) {           //Перевірка чи введені значення відповідають вірному формату дати за допомогою методу isValidDate.
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Неправильний місяць або день");
        }
    }

    private boolean isValidDate(int month, int day) {
        return month >= 1 && month <= 12 && day >= 1 && day <= 31;
    }		//Цей приватний метод перевіряє, чи введені значення для місяця і дня є вірними для формату дати.
    		//Умова month >= 1 && month <= 12 перевіряє, чи значення month знаходиться в межах від 1 до 12.
    		//Умова day >= 1 && day <= 31 перевіряє, чи значення day знаходиться в межах від 1 до 31.


    @Override
    public String toString() {
        return String.format("%02d/%02d", month, day);
    }			//Цей метод перевизначає стандартний метод toString() для класу CalendarDate.
    			//Використовує String.format для створення рядка, який представляє об'єкт у вигляді "місяць/день".
    			//%02d вказує форматування для цілих чисел, де число повинно бути виведене з двома цифрами (якщо менше, то доповнюється нулем зліва).

    @Override
    public int compareTo(CalendarDate otherDate) {
        if (this.month == otherDate.month) {
            return Integer.compare(this.day, otherDate.day);
        } else {
            return Integer.compare(otherDate.month, this.month);
        }			//Цей метод реалізує інтерфейс Comparable і визначає порівняння об'єктів CalendarDate.
        			//Спочатку порівнюється місяць (this.month і otherDate.month).
        			//Якщо місяці рівні, порівнюються дні (this.day і otherDate.day).
        			//Використовує Integer.compare для зручного порівняння значень.
        			//Повертає значення, яке вказує, який об'єкт менше або більше. Якщо вони рівні, повертається 0.
    }
}
