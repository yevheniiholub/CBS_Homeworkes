package Practice_lesson6;

import java.util.Scanner;

public class Task4plus {
    public static void main(String[] args) {
        int         userTerm;
        float       userSalary;
        float       userRemainder;
        float       userSum;
        float       userSalaryIncrease;
        float       calculationValue;
        int         calculationTerm;
        Scanner     userInput;

        // Зчитування зарплати
        userInput = new Scanner(System.in);
        System.out.println("Введіть вашу зарплату :");
        userSalary = userInput.nextInt();

        // Зчитування зростання зарплати
        userInput = new Scanner(System.in);
        System.out.println("Введіть сумму зростання зарплати :");
        userSalaryIncrease = userInput.nextInt();

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

        calculationValue = 0;
        calculationTerm = 0;
        // Розрахунок сумми яку зможе віддати клієнт за вказаний ним термін з врахуванням прибавки до зарплати
        for (int i = 1; i <= userTerm; i++){
            calculationValue += userRemainder + (userSalaryIncrease * i);
        }

        // Якщо розрахована сумма входить в діапазон вказаної клієнтом сумми
        if (calculationValue >= userSum){
            System.out.println("Кредит одобрено!");
        }
        // Якщо ні то пропонуємо змінити умови кредиту
        else {
            // Розрахунок терміну, для вказаної користувачем сумми, з врахуванням прибавки до зарплати
            for (int i = 1, j = 0; userSum > j; i++){
                calculationTerm++;
                j += userRemainder + (userSalaryIncrease * i);
            }
            // Вивід пропозиції щодо зміни умов кредиту
            System.out.printf("Кредит не одобрено: збільшіть термін виплат до %d, або зменшіть сумму кредиту до %.2f",
                    calculationTerm, calculationValue);
        }
        /*
            Вивід:
            Введіть вашу зарплату :
            10000
            Введіть сумму зростання зарплати :
            100
            Введіть ваш залишок на кінець місяця :
            200
            Введіть термін кредиту :
            7
            Введіть сумму кредиту :
            4300
            Кредит не одобрено: збільшіть термін виплат до 8, або зменшіть сумму кредиту до 4200,00
         */
    }
}
