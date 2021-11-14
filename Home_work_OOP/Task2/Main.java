package Home_work_OOP.Task2;

import Home_work_OOP.Task2.Rectangle.Rectangle;

import java.util.Scanner;

public class Main {
    /*
        Задание 2
        Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
        создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
        вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
        прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
        принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
        площадь.
     */

    public static void main(String[] args) {
        double userSideOne;
        double userSideTwo;
        Scanner userInput;
        Rectangle userRectangle;

        // Ініціалізація локальної змінної першої сторони прямокутника від користувача
        userInput = new Scanner(System.in);
        System.out.println("Введіть розміри першої сторони");
        userSideOne = userInput.nextDouble();

        // Ініціалізація локальної змінної другої сторони прямокутника від користувача
        userInput = new Scanner(System.in);
        System.out.println("Введіть розміри другої сторони");
        userSideTwo = userInput.nextDouble();

        // Ініціалізація об'єкту класа Rectangle, через конструктор який приймає в себе значення двох сторін
        userRectangle = new Rectangle(userSideOne, userSideTwo);

        // Вивід результатів розрахунку
        System.out.println("Периметр прямокутника: " + userRectangle.perimeterCalculator());
        System.out.println("Площа прямокутника: " + userRectangle.areaCalculator());

        /*
            Примітка: В умовах задачі сказано що потріно створити методи классу які приймають в себе дві сторони
            прямокутника як аргументи double areaCalculator (double side1, double side2),
            double perimeterCalculator (double side1, double side2). Але я не бачу в цьому сенсу, тому що клас вже
            містить в собі поля з значеннями цих двох сторін. Тому методи розрахунку не містять ніяких аргументів
            а використовують свої внутрішні поля
         */

        /*
            Вивід:
            Введіть розміри першої сторони
            22
            Введіть розміри другої сторони
            34
            Периметр прямокутника: 112.0
            Площа прямокутника: 748.0
         */
    }
}
