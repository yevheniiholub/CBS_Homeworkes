package Practice_lesson6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int         userTerm;
        float       userSalary;
        float       userRemainder;
        float       userSum;
        String      userOutputPositiveMsg;
        String      userOutputNegativeMsg;
        Scanner     userInput;

        // Ініціалізація позитивного і негативного повідомленнь

        userOutputPositiveMsg = "Шановний клієнте, раді вам повідомити що ваше прохання в наданні кредиту в суммі " +
                "%.2f на термін %d місяців успішно одобрено!\n";
        userOutputNegativeMsg = "Шановний кліэнте, нажаль не можемо видати вам кредит в суммі %.2f на термін %d " +
                "місяців\nнатомість можемо запропонувати вам зменшити кредит на %.2f, або збільшити термін кредиту " +
                "на %.2f\n";

        // Зчитування зарплати
        userInput = new Scanner(System.in);
        System.out.println("Введіть вашу зарплату :");
        userSalary = userInput.nextInt();

        // Зчитування залишку
        userInput = new Scanner(System.in);
        System.out.println("Введіть ваш залишок на кінець місяця :");
        userRemainder = userInput.nextInt();

        // Зчитування терміну
        userInput = new Scanner(System.in);
        System.out.println("Введіть термін кредиту :");
        userTerm = userInput.nextInt();

        // Зчитування суми
        userInput = new Scanner(System.in);
        System.out.println("Введіть сумму кредиту :");
        userSum = userInput.nextFloat();

        // В разі якщо добуток сумми від залишку вписується в термін вказаний користувачем то тоді виводим повідомлення
        // з позитивною відповіддю
        if (userSum / userRemainder <= userTerm) {

            System.out.println(String.format(userOutputPositiveMsg, userSum, userTerm ));
        }
        // В іншому випадку виводимо негативну відповідь з пропозицією зменшення сумми кредиту, або збільшенням терміну
        else {
            // Останній аргумент це тернарник, який перевіряє чи потрібно нам заокруглювати число в вищу сторону
            // якщо оезутьтат ділення чисел з плавоючою точкою більше ніж результат ділення цілочисленних значеннь
            // то тоді виводимо результат скащений в цілочисельний + 1, якщо не більше то тоді просто скащений результат

            System.out.println(String.format(userOutputNegativeMsg, userSum, userTerm, userRemainder,
                    (userSum / userRemainder) < (userSum / userRemainder) ? (userSum / userRemainder) + 1 :
                            (userSum / userRemainder)));
        }
    }
}
