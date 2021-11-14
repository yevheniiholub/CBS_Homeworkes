package Home_work7;

import java.util.Scanner;

public class Conversion {
    /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс Conversion.
        Напишите программу, которая будет выполнять конвертирование валют.
        Пользователь вводит:
        сумму денег в определенной валюте,
        курс для конвертации в другую валюту.
        Организуйте вывод результата операции конвертирования валюты на экран.
     */

    /*
     * Метод для отримання конвертуючого значення від користувача
     */
    public static float getUserValue(){
        Scanner userInput;

        // Зчитування значення
        userInput = new Scanner(System.in);     // Ініціалізація сканера
        System.out.println("Введіть значення"); // Прохання ввести значення
        return userInput.nextFloat();           // Повернення значення в main()
    }

    /*
     * Метод для отримання назви валюти від користувача
     */
    public static String getUserCurrency(){
        Scanner userInput;

        // Зчитування валюти
        userInput = new Scanner(System.in);                     // Ініціалізація сканера
        System.out.println("Введіть валюту (Dollar/Grivna)");   // Прохання ввести значення
        return userInput.next();                                // Повернення значення в main()
    }

    /*
     * Метод для конвертації доллара до гривні
     */
    public static void fromDollarToGrivna(float dollar){
        final float DOLLAR_CURENCY = 26.30f;                        // Курс
        System.out.printf("%.2f грн", (dollar * DOLLAR_CURENCY));   // Вивід конвертованого числа
    }

    /*
     * Метод для конвертації гривні до доллара
     */
    public static void fromGrivnaToDollar(float grivna){
        final float DOLLAR_CURRENCY = 26.30f;                       // Курс
        System.out.printf("%.2f дол", (grivna / DOLLAR_CURRENCY));  // Вивід конвертованого числа
    }

    public static void main(String[] args) {
        float       userValue;
        String      userCurrency;

        // Отримання валюти і значення від користувача
        userValue = getUserValue();
        userCurrency = getUserCurrency();

        // Визначення необхідної операції і її виконання
        switch (userCurrency) {
            case "Dollar":
                fromDollarToGrivna(userValue);
                break;
            case "Grivna":
                fromGrivnaToDollar(userValue);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        /*
            Введіть значення
            30
            Введіть валюту (Dollar/Grivna)
            Dollar
            789,00 грн
        */
    }
}
