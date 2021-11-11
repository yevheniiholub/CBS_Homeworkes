package Home_work7;

import java.util.Scanner;

public class Arithmetics {
    /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс Arithmetics.
        Создайте четыре метода для выполнения арифметических операций, с именами: add – сложение, sub –
        вычитание, mul – умножение, div – деление. Каждый метод должен принимать два целочисленных
        аргумента и выводить на экран результат выполнения арифметической операции соответствующей
        имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
        Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак
        арифметической операции, для выполнения вычислений
     */

    // Множення
    public static int mul(int firstArg, int secondArg) {
        return firstArg * secondArg;
    }

    // Ділення
    public static int div(int firstArg, int secondArg) {
        if (secondArg == 0) {
            System.out.println("Ділити на нуль неможливо!");
            return 0;
        }
        else {
            return firstArg / secondArg;
        }
    }

    // Додавання
    public static int add(int firstArg, int secondArg){
        return firstArg + secondArg;
    }

    // Віднімання
    public static int sub(int firstArg, int secondArg){
        return firstArg - secondArg;
    }


    public static void main(String[] args) {
        int userFirstInteger;
        int userSecondInteger;
        String userOperator;
        String userMessage;
        Scanner userInput;

        userMessage = "Результат %d \n";

        userInput = new Scanner(System.in);
        System.out.println("Введіть перше значення :");
        userFirstInteger = userInput.nextInt();

        userInput = new Scanner(System.in);
        System.out.println("Введіть друге значення :");
        userSecondInteger = userInput.nextInt();

        userInput = new Scanner(System.in);
        System.out.println("Введіть оператор :");
        userOperator = userInput.next();

        switch (userOperator) {
            case "+":
                System.out.println(String.format(userMessage,add(userFirstInteger, userSecondInteger)));
                break;
            case "-":
                System.out.println(String.format(userMessage,sub(userFirstInteger, userSecondInteger)));
                break;
            case "*":
                System.out.println(String.format(userMessage,mul(userFirstInteger, userSecondInteger)));
                break;
            case "/":
                System.out.println(String.format(userMessage,div(userFirstInteger, userSecondInteger)));
                break;
            default:
                System.out.println("Некорректний оператор!");
        }
        /*
            Вивід:
            Введіть перше значення :
            9
            Введіть друге значення :
            2
            Введіть оператор :
            /
            Результат 4
         */
    }
}
