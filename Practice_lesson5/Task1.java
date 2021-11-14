package Practice_lesson5;

import java.util.Scanner;

public class Task1 {
    /*
        Задание: *
        Пользователь должен ввести:
        Имя, возраст и свой пол.  +
        Если возраст человека не является пенсионным - мы пишем:
        Вам еще рано на пенсию!
        Во всех остальных случаях мы пишем что уже пора на пенсию.
        Для мужчин 65, для женщин 60 - возрат выхода на пенсию.

     */
    public static void main(String[] args) {
        final int WOMAN_MAX_AGE = 60;
        final int MAN_MAX_AGE = 65;
        String userName;
        String userGender;
        int userAge;
        Scanner userInput;

        // Зчитування імені
        userInput = new Scanner(System.in);         // Ініціалізація сканера
        System.out.println("Введіть ім'я :");       // Повідомлення з проханням ввести ім'я
        userName = userInput.next();                // Присвоєння змінній зчитаного імені користувача

        // Зчитування статі
        userInput = new Scanner(System.in);         // Ініціалізація сканера
        System.out.println("Введіть стать :");      // Повідомлення з проханням ввести стать
        userGender = userInput.next();              // Присвоєння змінній зчитаної статі користувача

        // Зчитування віку
        userInput = new Scanner(System.in);         // Ініціалізація сканера
        System.out.println("Введіть вік :");        // Повідомлення з проханням ввести вік
        userAge = userInput.nextInt();              // Присвоєння змінній зчитаного віку користувача

        // Якщо стать чоловіча
        if (userGender.equalsIgnoreCase("чоловіча")) {
            // Якщо вік менший ніж пенсіонний
            if (userAge < MAN_MAX_AGE){
                System.out.printf("Шановний %s ще рано на пенсію!", userName);
            }
            // Якщо більший
            else{
                System.out.printf("Шановний %s вам вже пора на пенсію!", userName);
            }
        }
        // Якщо стать чоловіча
        else if (userGender.equalsIgnoreCase("жіноча")) {
            // Якщо вік менший ніж пенсіонний
            if (userAge < WOMAN_MAX_AGE){
                System.out.printf("Шановна %s ще рано на пенсію!", userName);
            }
            // Якщо більший
            else {
                System.out.printf("Шановна %s вам вже пора на пенсію!", userName);
            }
        }
        // Якщо стать введена некорректно
        else {
            System.out.println("Некорректно введена стать!");
        }
        /*
            Приклади вводу:
            Введіть ім'я :
            Світлана
            Введіть стать :
            жіноЧА
            Введіть вік :
            61
            Шановна Світлана вам вже пора на пенсію!

            Введіть ім'я :
            Степан
            Введіть стать :
            чоловіча
            Введіть вік :
            64
            Шановний Степан ще рано на пенсію!
         */
    }
}
