package Static_and_Nested_Classes.Additional_task;

/*
    Задание
    Используя IntelliJ IDEA, создайте проект.
    Требуется:
    Создать класс Calculator, с методами для выполнения основных арифметических операций.
    Написать программу, которая выводит на экран основные арифметические операции.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(124,26));
        System.out.println(Calculator.sub(124,26));
        System.out.println(Calculator.div(124,26));
        System.out.println(Calculator.mul(124,26));
        System.out.println(Calculator.mod(124,26));

        /*
            out
            150.0
            98.0
            4.769230769230769
            3224.0
            20.0
         */
    }
}
