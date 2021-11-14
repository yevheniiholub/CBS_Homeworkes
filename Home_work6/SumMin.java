package Home_work6;

import java.util.Scanner;

public class SumMin {
    /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс SumMin.
        Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
        Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.
     */
    public static void main(String[] args) {
        int userA;
        int userB;
        int i;
        int rangeSum;
        Scanner userInput;

        userInput = new Scanner(System.in);
        System.out.println("Введіть А");
        userA = userInput.nextInt();

        userInput = new Scanner(System.in);
        System.out.println("Введіть А");
        userB = userInput.nextInt();

        i = userA;                              // Ініціалізація лічильника мінімальним значенням діапазону
        rangeSum = 0;                           // Ініціалізація змінної суми значеннь в діапазоні

        // Поки лічильник не досягне максимального значення діапазону
        while (i < userB) {
            rangeSum += i;                      // Додаємо значення до сумми
            i++;
        }
        // Вивід результату першої половини завдання
        System.out.printf("Сумма всіх числе в діапазоні від %d до %d = %d\n",  userA, userB, rangeSum);

        // Реініціалізація лічильника
        i = userA;

        // Повідомлення про початок виведеня результату другого блоку завдання
        System.out.printf("Непарні числа в діапазоні від %d до %d\n", userA, userB);

        // Поки лічильник не досягне максимального значення діапазону
        while (i < userB) {
            // Якщо результат ділення з залишком не дорівнює нулю, то число непарне
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        /*
        Вивід:
            Введіть А
            5
            Введіть А
            19
            Сумма всіх числе в діапазоні від 5 до 19 = 161
            Непарні числа в діапазоні від 5 до 19
            5
            7
            9
            11
            13
            15
            17
         */
    }
}
