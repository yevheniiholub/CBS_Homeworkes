package Home_work3;
public class ArithmeticAverage {
    public static void main(String[] args) {
        /*
            Задание 2
            Используя IntelliJ IDEA, создайте класс ArithmeticAverage .
            Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
                    С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного
            отображения результата?
        */

        // Декларація і ініціалізація
        int firstInteger = 13;
        int ыecondInteger = 666;
        int thirdInteger = 5436;
        float meanValue;

        // Обробка
        meanValue = ((float)firstInteger + (float)ыecondInteger + (float)thirdInteger) / 3;

        // Вивід
        System.out.println(meanValue);

        /*
            Результат:
            2038.3334

            Висновок: При цілочисельному обчисленні втачається точність і тому потрібно зкастити змінні до
            формату float, або double
        */
    }
}
