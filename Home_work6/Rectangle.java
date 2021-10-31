package Home_work6;

import java.util.Scanner;

public class Rectangle {
    /*
        Задание
        Используя IntelliJ IDEA, создайте класс Rectangle.
        Создайте две целочисленные переменные и задайте им некоторые значения. Применяя технику
        вложенных циклов, нарисуйте прямоугольник из звездочек. Используйте значения ранее созданных
        переменных для указания высоты и ширины прямоугольника.
     */
    public static void main(String[] args) {
        int userHight;
        int userWidth;
        Scanner userInput;
        int i;

        // Задання висоти користувачем
        userInput = new Scanner(System.in);
        System.out.println("Введіть висоту :");
        userHight = userInput.nextInt();

        // Задання ширини користувачем
        userInput = new Scanner(System.in);
        System.out.println("Введіть ширину :");
        userWidth = userInput.nextInt();

        // Прямокутник
        // Цикл по вертикалі
        for (int j = 0 ; j <= userHight; j++) {
            i = 0;
            // Цикл по горизонталі
            while (i <= userWidth) {
                // Якщо знаходиться на крайніх точка хоч одної координати то виводити *
                if (j == 0 || j == userHight || i == userWidth || i == 0) {
                    System.out.print("*");
                    // В іншому випадку " "
                } else {
                    System.out.print(" ");
                }
                i++;
            }
            // При завершені лінії перейти на нову
            System.out.print("\n");
        }
        /*
            Приклад:
            Введіть висоту :
            14
            Введіть ширину :
            17
            ******************
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            *                *
            ******************
         */
    }
}
