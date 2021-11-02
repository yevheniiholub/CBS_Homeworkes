package Practice_lesson6;

import java.util.Scanner;

public class Task2 {
    /*
            Вывести в консоль числа (от нуля) высотой N и шириной M.
        Например: n = 3, m = 2;
        0 1
        2 3
        3 4
        Пример: n = 3, m = 3;
        0 1 2
        3 4 5
        6 7 8
     */

    public static void main(String[] args) {
        int     userHight;
        int     userWidth;
        Scanner userInput;

        // Считування ширини від користувача
        userInput = new Scanner(System.in);         // Ініціалізація сканера
        System.out.print("Введіть ширину: ");       // Повідомлення з проханням ввести ширину
        userWidth = userInput.nextInt();            // Присвоєння зчитанного значення до змінної ширини

        // Считування висоти від користувача
        userInput = new Scanner(System.in);         // Ініціалізація сканера
        System.out.print("Введіть висоту: ");       // Повідомлення з проханням ввести висоту
        userHight = userInput.nextInt();            // Присвоєння зчитанного значення до змінної висоти


        for (int i = 0, dispayedInteger = 0; i < userHight; i++){       // Цикл по висоті, ініціалізація доп змінної
            for (int j = 0; j < userWidth; j++){                        // Цикл по ширині
                System.out.print(dispayedInteger++ + " ");              // Виведення доп змінної і її інкрементація
            }
            System.out.print('\n');                                     // Переведення на нову строку при досягненні
        }                                                               // максимальної ширини
    }

    /*
        Приклад виводу:
        Введіть ширину: 3
        Введіть висоту: 3
        0 1 2
        3 4 5
        6 7 8
     */
}
