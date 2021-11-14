package Home_Work5;

import java.util.Scanner;

public class Premium {
    /*
        Используя IntelliJ IDEA, создайте класс Premium.
        Напишите программу расчета начисления премий сотрудникам. Премии рассчитываются согласно
        выслуге лет.
        Если выслуга до 5 лет, премия составляет 10% от заработной платы.
        Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
        Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
        Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
        Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
        Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
        Результаты расчета, выведите на экран.
     */
    public static void main(String[] args) {
        Scanner userInput;
        int userYears;

        // Зчитування стажу
        userInput = new Scanner(System.in);         // Ініціалізація сканера
        System.out.println("Введіть ваш стаж: ");   // Повідомлення з проханням ввести стаж
        userYears = userInput.nextInt();            // Запис стажу в змінну

        if (userYears < 5) {
            System.out.println("премія складає 10%");
        } else if (userYears < 10) {
            System.out.println("премія складає 15%");
        } else if (userYears < 15) {
            System.out.println("премія складає 25%");
        } else if (userYears < 20) {
            System.out.println("премія складає 35%");
        } else if (userYears < 25) {
            System.out.println("премія складає 45%");
        } else {
            System.out.println("премія складає 50%");
        }
        /*
            Приклад виводу
            Введіть ваш стаж:
            13
            премія складає 25%
         */
    }
}
