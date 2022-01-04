package Reflection.Task2;

import java.lang.reflect.Member;
import java.util.Scanner;

/*
    Задание 2
    Напишите программу, которая будет выводить всю информацию о классе, пользователь
    сам выбирает, какой именно класс интересует.
 */

public class Main {

    public static void printClassInfo(Member [] members){
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введіть ім'я класу: ");
        try {
            Scanner scanner = new Scanner(System.in);
            Class userClass = Class.forName(scanner.next());

            System.out.println( "\u001B[32m" + "Ім'я классу" + "\u001B[0m");
            System.out.println(userClass);

            System.out.println("\u001B[32m" + "Поля классу" + "\u001B[0m");
            printClassInfo(userClass.getFields());

            System.out.println("\u001B[32m" + "Коструктори классу" + "\u001B[0m");
            printClassInfo(userClass.getConstructors());

            System.out.println("\u001B[32m" + "Методи классу" + "\u001B[0m");
            printClassInfo(userClass.getMethods());

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
