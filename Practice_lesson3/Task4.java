package Practice_lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
            4. С помощью Scanner - считать 2 целых (на ваш выбор) числа и добавить друг к другу.

            К примеру:

            1 число = 5

            2 число = -5

            Ответ который должна выдать программа - 0
        */

        int firstInteger;
        int secondInteger;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Введіть позитивне число:");
        firstInteger = userInput.nextInt();
        System.out.println("Введіть негативне число:");
        secondInteger = userInput.nextInt();
        System.out.println("Результат: " + (firstInteger + secondInteger));

        /*
            Вивід
            Введіть позитивне число:
            5
            Введіть негативне число:
            -5
            Результат: 0
        */

    }
}
