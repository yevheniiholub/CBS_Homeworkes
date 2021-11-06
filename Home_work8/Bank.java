package Home_work8;

import java.util.Scanner;
    /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс Bank.
        Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
        кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
        выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
        и 400 грн. Закрыть весь долг.
        Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
        банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
        переплаты, сообщение об отсутствии долга).
    */

public class Bank {

    /*
     *  Зчитування значення користувача
     */
    public static int getUserInt() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    /*
     *
     * Обчислення
     */
    public static void indebtednessCheck(int argSum, int argTerm, int argMinPay) {
        int userPayment;

        // Цикл з лекрементуючим лічильнико терміну до нуля
        for (; argTerm >= 0; argTerm--) {
            // Зчитування і присвоєння значення платежу
            System.out.println("Введіть сумму платежу: ");
            userPayment = getUserInt();

            // Перевірка на переплату чи недоїмку і виведення інформації відповідно до результату перевірки
            if (userPayment > argMinPay) {
                System.out.printf("Переплата %d\n", (userPayment - argMinPay));
            }
            else if (userPayment < argMinPay) {
                System.out.printf("Недоїмка %d\n", (userPayment - argMinPay));
            }
            else {
                System.out.println("Рівний мінімальному");
            }

            // Віднімаємо платіж від боргу
            argSum -= userPayment;

            // Якщо умови для продовжування виплат виконуються, то виводимо інформацію про сумму
            // боргу і залишкового терміну
            if (argSum > 0 && argTerm > 0) {
                System.out.printf("Кредитний залишок: %d, залишилось місяців: %d\n", argSum, argTerm);
            }
            else {
                // Якщо борг виплачений
                if (argSum <= 0) {
                    System.out.printf("Кредит успішно погашений!\n");
                    return;
                }
                // Якщо термін виплат минув
                else {
                    System.out.printf("Термін виплат минув. Кредитний залишок: %d\n", argSum);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int userSum;
        int userTerm;
        int userMinPay;

        // Зчитування необхідних ввідни данних
        System.out.println("Введіть сумму боргу: ");
        userSum = getUserInt();

        System.out.println("Введіть термін для погашення боргу: ");
        userTerm = getUserInt();

        System.out.println("Введіть мінімальний платіж: ");
        userMinPay = getUserInt();

        // Виклик методу обчислення боргу
        indebtednessCheck(userSum, userTerm, userMinPay);
        /*
            Приклад:
            Введіть сумму боргу:
            100
            Введіть термін для погашення боргу:
            3
            Введіть мінімальний платіж:
            34
            Введіть сумму платежу:
            20
            Недоїмка -14
            Кредитний залишок: 80, залишилось місяців: 3
            Введіть сумму платежу:
            50
            Переплата 16
            Кредитний залишок: 30, залишилось місяців: 2
            Введіть сумму платежу:
            30
            Недоїмка -4
            Кредит успішно погашений!
         */
    }
}
