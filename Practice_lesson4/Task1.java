package Practice_lesson4;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    /*
        Выбор за вами, но перед началом задания попробуйте подумать.
        Пользователь вводит число, вам нужно указать какой это месяц по счету.
        На выбор вы можете использовать конструкцию как switch так и if else if
        Если вы выбрали if else - указать почему, какие преимущества дает по сравнению со switch для данного задания.
        Если вы выбрали switch - Также.
    */
    public static void main(String[] args) {
        Scanner userInput;
        String  userString;

        // Зчитування строки через Scanner
        userInput = new Scanner(System.in);
        System.out.println("Введіть місяць");
        userString = userInput.next();
        /*
            Приводимо введену юзером строку до верхнього регістру і шукаєммо введене значення серед списку
            існуючих місяців, якщо такого немає - то виводимо помилку зчитування
            Примітка: Обрав конструкцію Switch тому що в данному випадку порівнюється лише одна умова
                      і на маю думку дана констукція вигядає більш читабельною ніж if else для даного
                      випадку
         */
        switch (userString.toUpperCase())
        {
            case "СІЧЕНЬ":
                System.out.println("Номер введеного місяця 1");
                break;
            case "ЛЮТИЙ":
                System.out.println("Номер введеного місяця 2");
                break;
            case "БЕРЕЗЕНЬ":
                System.out.println("Номер введеного місяця 3");
                break;
            case "КВІТЕНЬ":
                System.out.println("Номер введеного місяця 4");
                break;
            case "ТРАВЕНЬ":
                System.out.println("Номер введеного місяця 5");
                break;
            case "ЧЕРВЕНЬ":
                System.out.println("Номер введеного місяця 6");
                break;
            case "ЛИПЕНЬ":
                System.out.println("Номер введеного місяця 7");
                break;
            case "СЕРПЕНЬ":
                System.out.println("Номер введеного місяця 8");
                break;
            case "ВЕРЕСЕНЬ":
                System.out.println("Номер введеного місяця 9");
                break;
            case "ЖОВТЕНЬ":
                System.out.println("Номер введеного місяця 10");
                break;
            case "ЛИСТОПАД":
                System.out.println("Номер введеного місяця 11");
                break;
            case "ГРУДЕНЬ":
                System.out.println("Номер введеного місяця 12");
                break;
            default:
                System.out.println("Некорректно введений місяць");
                break;
        }
        /*  Приклад виводу
            Введіть місяць
            ЛиСТопад
            Номер введеного місяця 11
         */
    }
}
