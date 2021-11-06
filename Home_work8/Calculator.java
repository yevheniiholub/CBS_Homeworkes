package Home_work8;

import java.util.Scanner;

public class Calculator {

    /*
        Задание
        Используя IntelliJ IDEA, создайте класс Calculator.
        Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
        значения и возвращает значение каждого аргумента, деленного на 5.
     */

    /*
     *  Зчитування значення користувача
     */
    public static int getUserInt(){
        Scanner  userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    /*
     *  Перегрузка обчислення для першого аргументу
     */
    public static int calculate(int firstArg, short secondArg, long thirdArg){
        final int FIVE = 5;
        return firstArg / FIVE;
    }

    /*
     *  Перегрузка обчислення для другого аргументу
     */
    public static int calculate(long firstArg, int secondArg, short thirdArg){
        final int FIVE = 5;
        return secondArg / FIVE;
    }

    /*
     *  Перегрузка обчислення для третього аргументу
     */
    public static int calculate(short firstArg, long secondArg, int thirdArg){
        final int FIVE = 5;
        return thirdArg / FIVE;
    }

    public static void main(String[] args) {
        int     userFirst;
        int     userSecond;
        int     userThird;
        String  userStrFormat;

        // Читування вхідних данних від користувача
        System.out.println("Введіть перше значення:");
        userFirst = getUserInt();

        System.out.println("Введіть друге значення:");
        userSecond = getUserInt();

        System.out.println("Введіть третє значення:");
        userThird = getUserInt();

        // Ініціалізація формату вивода
        userStrFormat = "Перше / 5 = %d\nдруге / 5 = %d\nтретє / 5 = %d\n";

        // Вивід почерзі результату кожного перегруженого методу
        System.out.println(String.format(userStrFormat, calculate(userFirst, (short)userSecond, (long)userThird),
                calculate((long)userFirst, userSecond, (short)userThird),
                calculate((short)userFirst, (long)userSecond, userThird)));
        /*
            Вивід:
            Введіть перше значення:
            10
            Введіть друге значення:
            20
            Введіть третє значення:
            30
            Перше / 5 = 2
            друге / 5 = 4
            третє / 5 = 6
         */
    }
}
