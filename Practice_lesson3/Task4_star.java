package Practice_lesson3;

public class Task4_star {
    /*
        4*. (выполнив это задание, вы выполните часть домашнего).

        Даны 2 числа (выбирите самостоятельно, сканнер не обязателен).

        Вам нужно с помощью System.out.printf Вывести все 5 операций между этими числами. Вывод должен выглядеть вот так:

        first number = 5

        second number = 10

        operation -

        result = -5



        System.out.printf("first number = ... \n second number = ... );



        ** если исключить main, class и скобки {} решение должно занять не более 10 строчек.
     */
    public static void main(String[] args) {
        int a = 24;
        int b = 14;

        System.out.printf("first number = %d\nsecond number = %d\noperation -\nresult = %d\n", a, b, (a - b));
        System.out.printf("first number = %d\nsecond number = %d\noperation +\nresult = %d\n", a, b, (a + b));
        System.out.printf("first number = %d\nsecond number = %d\noperation *\nresult = %d\n", a, b, (a * b));
        System.out.printf("first number = %d\nsecond number = %d\noperation /\nresult = %d\n", a, b, (a / b));
        System.out.printf("first number = %d\nsecond number = %d\noperation %% \nresult = %d\n", a, b, (a % b));
    }
}
