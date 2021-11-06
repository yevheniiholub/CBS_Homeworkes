package Practice_lesson6;

import java.util.Scanner;

public class Task4plusplus {
    public static void main(String[] args) {
    int         userTerm;
    float       userSalary;
    float       userRemainder;
    float       userSum;
    float       userSalaryIncrease;
    float       calculationValue;
    int         calculationTerm;
    Scanner     userInput;
    int         errorCountSalary = 0;
    int         errorCountTerm = 0;
    int         errorCountReminder = 0;
    int         errorCountSum = 0;
    int         errorCountSalaryIncrease = 0;

    while (true) {
        // Перевіока на одиночні помилки
        if (errorCountSalary > 2 || errorCountTerm > 2 || errorCountReminder > 2 || errorCountSum > 2 ||
                errorCountSalaryIncrease > 2){
            System.out.println("Допущено 3 помилки при введені одного і того самог поля!");
            // Припиняємо роботу программи
            return ;
        }
        // Перевірка на загальні помилки
        else if (errorCountSalary + errorCountTerm + errorCountReminder + errorCountSum + errorCountSalaryIncrease > 3){
            System.out.println("Допущено 4 загальних помилки при введені данних!");
            // Припиняємо роботу программи
            return;
        }
        // Продовження роботи якщо помилок немає
        else {
            // Зчитування зарплати
            userInput = new Scanner(System.in);
            System.out.println("Введіть вашу зарплату :");
            userSalary = userInput.nextInt();

            // Якщо значення помилкове
            if (userSalary < 0) {
                // Додаємо до персонального лічильника
                errorCountSalary++;
                // Виводимо попередження
                System.out.println("Некорректно введені данні!");
                // Викликаємо наступну ітерацію
                continue;
            }

            // Зчитування зростання зарплати
            userInput = new Scanner(System.in);
            System.out.println("Введіть сумму зростання зарплати :");
            userSalaryIncrease = userInput.nextInt();

            // Якщо значення помилкове
            if (userSalaryIncrease < 0) {
                // Додаємо до персонального лічильника
                errorCountSalaryIncrease++;
                // Виводимо попередження
                System.out.println("Некорректно введені данні!");
                // Викликаємо наступну ітерацію
                continue;
            }

            // Зчитування залишку
            userInput = new Scanner(System.in);
            System.out.println("Введіть ваш залишок на кінець місяця :");
            userRemainder = userInput.nextInt();

            // Якщо значення помилкове
            if (userRemainder < 0) {
                // Додаємо до персонального лічильника
                errorCountReminder++;
                // Виводимо попередження
                System.out.println("Некорректно введені данні!");
                // Викликаємо наступну ітерацію
                continue;
            }

            // Зчитування терміну
            userInput = new Scanner(System.in);
            System.out.println("Введіть термін кредиту :");
            userTerm = userInput.nextInt();

            // Якщо значення помилкове
            if (userTerm < 0) {
                // Додаємо до персонального лічильника
                errorCountTerm++;
                // Виводимо попередження
                System.out.println("Некорректно введені данні!");
                // Викликаємо наступну ітерацію
                continue;
            }

            // Зчитування суми
            userInput = new Scanner(System.in);
            System.out.println("Введіть сумму кредиту :");
            userSum = userInput.nextFloat();

            // Якщо значення помилкове
            if (userSum < 0) {
                // Додаємо до персонального лічильника
                errorCountSum++;
                // Виводимо попередження
                System.out.println("Некорректно введені данні!");
                // Викликаємо наступну ітерацію
                continue;
            }
            // Якщо всі данні введені коректно то перериваємо цикл
            break;
        }
    }
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
