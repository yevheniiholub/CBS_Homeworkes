package Practice_lesson4;

import java.util.Scanner;

public class Task2 {
    /*
        Пользователь вводит:
        (задание со * решить только с используя scanner, во всех остальных случаях используйте 2 варианта: пользователю
        есть 18 и нет с заранее записанными данными)
        Свое имя, возраст а также свой пол.
        Если возраст человека больше 18 - вывести:
        Пользователь %имя% вам %кол-во% лет и ваш пол %пол%. Вам доступен доступ.
        Во всех остальных случаях - написать:
        Вам не достаточно лет.
     */
    public static void main(String[] args) {
        String  userName;
        String  userGender;
        int     userAge;
        Scanner userInput;
        final String forbiddenUserName = "Женя";
        final String forbiddenUserGender = "Чоловіча";
        final int forbiddenUserAge = 25;


        // Зчитування імені юзера
        userInput = new Scanner(System.in);            // Ініціалізація вводу
        System.out.println("Введіть ваше ім'я :");     // Повідомлення з проханням ввести ім'я користувача
        userName = userInput.next();                   // Зчитування імені в відповідну строку

        // Зчитування статі юзера
        userInput = new Scanner(System.in);            // Реініціалізація вводу
        System.out.println("Введіть вашу стать :");    // Повідомлення з проханням ввести стать користувача
        userGender = userInput.next();                 // Зчитування імені в відповідну строку

        // Зчитування віку юзера
        userInput = new Scanner(System.in);            // Реініціалізація вводу
        System.out.println("Скільки вам років? :");    // Повідомлення з проханням ввести вік користувача
        userAge = userInput.nextInt();                 // Зчитування імені в відповідну строку

        // Якщо користувачу є або більше 18 років
        if (userAge >= 18) {
            // Перевірка на те, чи не являється юзер з цими данними заблокований
            if (!userName.equalsIgnoreCase(forbiddenUserName) && !userGender.equalsIgnoreCase(forbiddenUserGender) &&
                    userAge != forbiddenUserAge) {
                // Вивід позитивної відповіді з наданим доступом
                System.out.printf("Користувач %s вам %d років ваша стать %s. Доступ відкрито",
                        userName, userAge, userGender);
            }
            // Якщо данні користувача співпадають з данними заблокованого користувача
            else {
                // Вивід негативної відповіді з ненаданням доступу через те що данні користувача співпадають з данними
                // заблокованого користувача
                System.out.printf("Користувача %s вік: %d років стать: %s. В доступі відмовленно. Причина: " +
                                "Даний користувач знаходиться в бан листі", userName, userAge, userGender);
            }
        }
        // Якщо користувачу немає 18 років
        else {
            // Вивід негативної відповіді з ненаданням доступу через те що користувачу менше 18 років
            System.out.printf("Вам недостатньо років. Доступ закрито.");
        }
        /*
            Приклад виводу:
            Введіть ваше ім'я :
            Іван
            Введіть вашу стать :
            Чоловіча
            Скільки вам років? :
            19
            Користувач Іван вам 19 років ваша стать Чоловіча. Доступ відкрито
        */
    }
}
