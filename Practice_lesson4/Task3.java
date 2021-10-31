package Practice_lesson4;

import java.util.Scanner;

public class Task3 {
    /*
        **Используя конструкцию if else написать fizz_buzz для случайных чисел.
        Если случайное число делиться ТОЛЬКО нацело на 3 - вывести FIZZ
        Если случайное число делиться ТОЛЬКО нацело на 5 - вывести BUZZ
        Если случайное число делиться на 3 и на 5 - вывести FIZZ_BUZZ
        Во всех остальных случаях, вывести число.
        Вывод является таким:
        Число %число% является fizz_buzz
        ЛИБО
        Число %число% не является fizz_buzz
        Для генерации случайного числа можете использовать конструкцию:
        int random = (int)(Math.random()*100);
        Но можете и сканер.
        Решений задачи - очень много. Самое простое, во время вычислений использовать boolean значение которое будет
        говорить подходит ли вам число.
        Например:
        ```
        String.format("Число %d %s является fizz_buzz", random, ********);
        где ****** - тернарник.
     */
    public static void main(String[] args) {
        int randomInteger;
        final String CONST_BUZZ = "BUZZ";
        final String CONST_FIZZ = "FIZZ";
        final String CONST_FIZZ_BUZZ = "FIZZ_BUZZ";
        final String CONST_STRING_FORMAT = "Число %d %s являється fizz_buzz";

        // Генеруємо випадкове число
        randomInteger = (int)(Math.random()*100);

        // Якщо згенероване число відповіднає хоч одній умові fizz_buzz
        if (randomInteger % 3 == 0 || randomInteger % 5 == 0)
        {
            // Якщо число відповідає обом умовам то воно FIZZ_BUZZ
            if (randomInteger % 3 == 0 && randomInteger % 5 == 0)
            {
                System.out.printf(CONST_STRING_FORMAT,randomInteger, CONST_FIZZ_BUZZ );
            }
            // Якзо тільки FIZZ
            else if (randomInteger % 3 == 0)
            {
                System.out.printf(CONST_STRING_FORMAT,randomInteger, CONST_FIZZ );
            }
            // Якщо не відповідає ніяким з вище перечислених умов, то тді це BUZZ
            else
            {
                System.out.printf(CONST_STRING_FORMAT,randomInteger, CONST_BUZZ );
            }
        }
        // Якщо число не відповідає ніодній умові fizz_buzz
        else
        {
            System.out.printf(CONST_STRING_FORMAT,randomInteger, "не" );
        }
        /*
            Приклади:
            Число 92 не являється fizz_buzz
            Число 84 FIZZ являється fizz_buzz
            Число 75 FIZZ_BUZZ являється fizz_buzz
            Число 20 BUZZ являється fizz_buzz
        */
    }
}
