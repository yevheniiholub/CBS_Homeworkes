package Home_work2;

public class Task3 {
    public static void main(String[] args) {
        /*
        Задание 3
        Используя IntelliJ IDEA, создайте проект.
                Создайте три строковые переменные и присвойте им значения:
        "\nмоя строка 1"
        "\tмоя строка 2"
        "\aмоя строка 3"
        Выведите значение каждой переменной на экран. Какие отличия вы увидели. Сделайте выводы.
        */

//        String  firstStrWrong = "\nмоя строка 1",
//                secondStrWrong = "\tмоя строка 2",
//                thirdStrWrong = "\\aмоя строка 3";

//        System.out.println(firstStrWrong);
//        System.out.println(secondStrWrong);
//        System.out.println(thirdStrWrong);

        // Отриманий результат : 86:30
        //java: illegal escape character
        /*
        Причина: На початку кожної строки стоять спец символи в першій строці це \n - перехід на нову строку
                 в другій \t табуляція і в третій \a - теж спецсимвол, але точно не знаю як називається
                 в інтернеті знайшов що це audible bell, тобто якийсь звуковий сигнал.
        Вирішення проблеми: Щоб вивести вміст строки можна екранізувати спецсимвол.
        * */
        String  firstStrCorrect = "\\nмоя строка 1",
                secondStrCorrect = "\\tмоя строка 2",
                thirdStrCorrect = "\\aмоя строка 3";

        System.out.println(firstStrCorrect);
        System.out.println(secondStrCorrect);
        System.out.println(thirdStrCorrect);
        /*
        Щоб вивести спец символ можна вивести його як один чар

        char specSymbol = '\n';
        System.out.print(specSymbol);

        Або

        System.out.print('\n');
        */
    }
}
