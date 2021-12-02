package Exceptions.Additional_task;

import java.util.Scanner;

public class Calculator {

    /*
     *  Обробники оперцій
     */

    private static double add(double firstArg, double secondArg){
        return firstArg + secondArg;
    }

    private static double sub(double firstArg, double secondArg){
        return firstArg - secondArg;
    }

    private static double mul(double firstArg, double secondArg){
        return firstArg * secondArg;
    }

    private static double div(double firstArg, double secondArg) throws DividerIsZeroException{
        // Перевірка ділення на нуль
        if (secondArg == 0){
            throw new DividerIsZeroException("Impossible divide to zero!");
        }
        else {
            return firstArg / secondArg;
        }
    }

    /*
     *  Виклик відповідних операцій
     */
    private static double acceptCalculation(double firstArg, double secondArg, String operation)
            throws NotExistOperationException, DividerIsZeroException{
        switch (operation){
            case "add":
                return add(firstArg, secondArg);
            case "sub":
                return sub(firstArg, secondArg);
            case "mul":
                return mul(firstArg, secondArg);
            case "div":
                return div(firstArg, secondArg);
            default:
                // Якщо операції не знайдено в переліку, то підіймаємо відповідну помилку
                throw new NotExistOperationException("Operation is not exist!");
        }
    }

    public static double calculate() {
        double firstArg;
        double secondArg;
        double result;
        String operation;

        // Зчитування вхідних данних
        System.out.println("Input first argument: ");
        firstArg = new Scanner(System.in).nextDouble();

        System.out.println("Input second argument: ");
        secondArg = new Scanner(System.in).nextDouble();

        System.out.println("Input operation: ");
        operation = new Scanner(System.in).next();

        result = 0;
        try {
            // Розрахунок результату
            result = acceptCalculation(firstArg, secondArg, operation);
        }
        catch (DividerIsZeroException | NotExistOperationException e){
            // Обробка помилок
            System.err.println(e.getMessage());
            System.exit(-1);
        }
        return result;
    }
}
