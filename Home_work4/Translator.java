package Home_work4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        /*
            Задание 1
            Используя IntelliJ IDEA, создайте класс Translator.
            Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде. Требуется,
            чтобы пользователь вводил слово на русском языке, а программа давала ему перевод этого слова на
            английском языке. Если пользователь ввел слово, для которого отсутствует перевод, то следует вывести
            сообщение, что такого слова нет.
        */

        // Об'явлення змінних
        Scanner     userInput;
        String      userString;

        // Ініціалізація слова
        System.out.println("Введіть по російськи слово на погодню тематику для передкладу");
        userInput = new Scanner(System.in);
        userString = userInput.next();

        switch (userString)
        {
            case "дождь":
                System.out.println("rain");
                break;
            case "ветер":
                System.out.println("wind");
                break;
            case "снег":
                System.out.println("snow");
                break;
            case "тепло":
                System.out.println("warm");
                break;
            case "холодно":
                System.out.println("cold");
                break;
            case "солнечно":
                System.out.println("sunny");
                break;
            case "буря":
                System.out.println("storm");
                break;
            case "облачно":
                System.out.println("cloudy");
                break;
            case "жара":
                System.out.println("heat");
                break;
            case "оттепель":
                System.out.println("thaw");
                break;
            default:
                System.out.println("Нажаль цього слова немає в словнику программи :(");
        }
        /*
            Приклад:
            Введіть по російськи слово на погодню тематику для передкладу
            ветер
            wind
        */
    }

}
