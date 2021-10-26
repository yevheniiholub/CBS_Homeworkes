package Home_work4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        /*
            Задание 3
            Используя IntelliJ IDEA, создайте класс Interval.
            Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой
            промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток. Если
            пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то
            выводится соответствующее сообщение.
        */

        // Об'явлення змінних
        int     userInteger;
        Scanner userInput;

        // Ініціалізація числа
        userInput = new Scanner(System.in);
        System.out.println("Ввкдіть число від 0 до 100");
        userInteger = userInput.nextInt();

        if (userInteger >= 0 && userInteger <= 16)
        {
            System.out.println("Введене число в діапазоні [0 - 14]");
        }
        else if (userInteger >= 15 && userInteger <= 35)
        {
            System.out.println("Введене число в діапазоні [15 - 35]");
        }
        else if (userInteger >= 36 && userInteger <= 50)
        {
            System.out.println("Введене число в діапазоні [36 - 50]");
        }
        else if (userInteger >= 50 && userInteger <= 100)
        {
            System.out.println("Введене число в діапазоні [50 - 100]");
        }
        else
        {
            System.out.println("Введене число за межами діапазону [0 - 100]");
        }

        /*
            Привклад:   Ввкдіть число від 0 до 100
                        42
                        Введене число в діапазоні [36 - 50]
        */
    }
}
