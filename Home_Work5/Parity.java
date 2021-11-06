package Home_Work5;

import java.util.Scanner;

public class Parity {
    /*
        Задание 2
        Известно, что у четных чисел младший бит имеет значение 0
        Используя IntelliJ IDEA, создайте класс Parity.
        Напишите программу, которая будет выполнять проверку чисел на четность.
        Предложите два варианта решения поставленной задачи.
    */
    public static void main(String[] args) {
        final byte CMP_INTEGER = 0b0001;
        int userInteger;
        Scanner userInput;

        // Зчитування числа від користувача
        userInput = new Scanner(System.in);
        System.out.println("Введіть число :");
        userInteger = userInput.nextInt();

        // Кастимо зчитане число і перевіряємо його через "Побітове і", якщо результат = 1, то число непарне, якщо
        // == 0 то непарне
        if (((byte) userInteger & CMP_INTEGER) == 1) {
            System.out.printf("Число %d не парне!\n", userInteger);
        } else {
            System.out.printf("Число %d парне!\n", userInteger);
        }

        // Другий варіант рішення
        if ( userInteger % 2 != 0 ) {
            System.out.printf("Число %d не парне!\n", userInteger);
        } else {
            System.out.printf("Число %d парне!\n", userInteger);
        }
        /*
            Приклади виводу:
           Введіть число :
           7
           Число 7 не парне!
           Число 7 не парне!
         */
    }
}
