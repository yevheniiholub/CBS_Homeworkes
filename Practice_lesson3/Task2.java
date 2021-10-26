package Practice_lesson3;

public class Task2 {
    public static void main(String[] args) {
        /*
            2. Вычеслить значение дискриминанта.

            Для тех кто не помнит, это:

            D = b^2 -4ac

            Для чисел

            a = 5, b = 4, c = 0;

            a = 0, b = -2, c = 5;

            метод pow нужно использовать
        */

        double a;
        double b;
        double c;
        double D;

        a = 5.0d;
        b = 4.0d;
        c = 0.0d;

        D = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Перший результат D = " + D);

        a = 0.0d;
        b = -2.0d;
        c = 5.0d;

        D = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Другий результат D = " + D);

        // Вивід : Перший результат D = 16.0
        //         Другий результат D = 4.0
    }
}
