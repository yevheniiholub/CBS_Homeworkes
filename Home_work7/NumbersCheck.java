package Home_work7;

import java.util.Scanner;

public class NumbersCheck {
    /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс Conversion.
        Напишите программу, которая будет выполнять конвертирование валют.
        Пользователь вводит:
        сумму денег в определенной валюте,
        курс для конвертации в другую валюту.
        Организуйте вывод результата операции конвертирования валюты на экран.
     */

    /*
     *  Зчитування імені користувача
     */
    public static int getUserNumber(){
        Scanner userInput;

        // Зчитування значення
        userInput = new Scanner(System.in);
        System.out.println("Введіть число:");
        return (userInput.nextInt());
    }

    /*
     *  Перевірка на знак числа
     */
    public static boolean positiveCheck(int argCheck){
        // Більше 0 +, менше -
        return (argCheck >= 0);
    }

    /*
     *  Перевірка чи число яввляється простим
     */
    public static boolean simpleIntegerCheck(int argCheck){
        int divCount = 0;

        // Проганяэмо число через цикл від 1 до вказаного користувачем
        for (int i = 1; i < argCheck; i++){
            // Якщо значення лічильника являється дільником без залишку для значення вказаного користувачем, то
            // запам'ятовуємо його в допоміжний лічильник
            if (argCheck % i == 0){
                divCount++;
            }
        }

        // Якщо значеннь на яке ділиться значення користувача більше ніж 2, то воно являється складним і повертаємо
        // false, якщо навпаки то true
        return (divCount <= 2);
    }

    /*
     *  Перевірка чи ділиться число на одне із визначеного списку чисел
     */
    public static boolean divideCheck(int argCheck){
        final int TWO = 2;
        final int FIVE = 5;
        final int THREE = 3;
        final int SIX = 6;
        final int NINE = 9;

        // Якщо число ділиться хоч на одине із визначеного константами спуску чисел, то тоді повертаємо true
        if (argCheck % TWO == 0 || argCheck % FIVE == 0 || argCheck % THREE == 0 ||
                argCheck % SIX == 0 || argCheck % NINE == 0){
            return true;
        }
        // Якщо ні то false
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int     userInteger;
        String  strPosOrNeg;
        String  strSimple;
        String  strDivide;

        userInteger = getUserNumber();                                          // Зчитування числа
        strPosOrNeg = positiveCheck(userInteger) ? "позитивне" : "негативне";   // Результат перевірки на знак
        strSimple = simpleIntegerCheck(userInteger) ? "просте" : "складне";     // Результат перевірки на простоту
        strDivide = divideCheck(userInteger) ? "ділиться" : "не ділиться ні";   // Перевірка ділення на чисел із списку

        // Вивід результату
        System.out.printf("Введене число %s, %s і %s на одне із списку 2, 5, 3, 6, 9\n",
                strPosOrNeg, strSimple, strDivide);
        /*
            Приклад виводу:
            Введіть число:
            7
            Введене число позитивне, просте і не ділиться ні на одне із списку 2, 5, 3, 6, 9
         */
    }

}
