package Home_work3;

/*
    Задание 1
    Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
    Выполните и рассчитайте результат следующих операций для этих переменных:
     x += y - x++ * z;
     z = --x – y * 5;
     y /= x + 5 % z;
     z = x++ + y * 5;
     x = y - x++ * z;
 */

public class Task1 {
    public static void main(String[] args) {

        // Декларація і ініціалізація
        int x = 10;
        int y = 12;
        int z = 3;

        // Обробка
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;

        // Вивід
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z =" + z);

        /*
            Результат:
            x = -195
            y = -3
            z =-24
        */
    }
}
