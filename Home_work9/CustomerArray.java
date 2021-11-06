package Home_work9;

import java.util.Scanner;

public class CustomerArray {
    /*
        Задание 2
        Используя IntelliJ IDEA, создайте класс CustomerArray.
        Требуется:
        Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
        массива задает пользователь).
        Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
        элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
     */

    /*
     * Ініціалізація массиву розміром вказаним користувачем довільними значеннями
     */
    public static int [] initArrayByRandom(){
        int []  resultArray;
        int     userArrayLength;
        Scanner userInput;

        // Отрмання розміру масива від користувача
        userInput = new Scanner(System.in);
        System.out.println("Введіть бажаний розмір масиву:");
        userArrayLength = userInput.nextInt();

        resultArray = new int [userArrayLength];            // Ініціалізація масиву
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = (int)(Math.random()*1000);     // Присвоєння кожному елементу довільного значення
        }
        return resultArray;
    }

    /*
     * Знаходження максимального значення в масиві
     */
    public static int findMaxInArray(int [] argArray){
        int result;

        result = argArray[0];       // Інінціалізація змінної першим елементом масиву
        for (int j : argArray) {
            if (j > result) {       // Якщо елемент який ми роглядуємо більший ніж той що у змінній
                result = j;         // Оновлюєммо максимальне значення
            }
        }
        return result;
    }

    /*
     * Знаходження мінмального значення в масиві
     */
    public static int findMinInArray(int [] argArray){
        int result;

        result = argArray[0];       // Інінціалізація змінної першим елементом масиву
        for (int j : argArray) {
            if (j < result) {       // Якщо елемент який ми роглядуємо більший ніж той що у змінній
                result = j;         // Оновлюєммо максимальне значення
            }
        }
        return result;
    }

    /*
     * Знаходження сумми всіх значеннь в масиві
     */
    public static int findArraySum(int [] argArray){
        int result;

        result = 0;
        for (int j : argArray) {
            result += j;            // Додаємо всі елементи в змінну
        }
        return result;
    }

    /*
     * Знаходження середнього арефметичного значення всіх елементів масиву
     */
    public static int findArrayAvarageVal(int [] argArray){
        return findArraySum(argArray) / argArray.length;        // Суму ділимо на кількість елементів
    }

    /*
     * Вивід всіх непарних елементів масиву
     */
    public static void printOddArrayValues(int [] argArray){
        for (int j : argArray) {
            if (j % 2 != 0) {                   // Якщо елемент не ділиться без залишку на 2
                System.out.print(j + " ");      // Виводимо і ставимо відступ
            }
        }
        System.out.print("\n");                 // Перехід на нову строкку
    }


    public static void answerOutput(int [] argArray){
        String outFormat = "Максимальне значення массиву: %d\nМінімальне значення масиву: %d\n" +
                "Сумма всіх елементів масиву: %d\nСереднє арефметичне значення всіх елементів масиву: %d\n" +
                "Всі непарні елементи масиву: ";

        // Вивід результатів
        System.out.print(String.format(outFormat, findMaxInArray(argArray), findMinInArray(argArray),
                findArraySum(argArray), findArrayAvarageVal(argArray)));
        // Викслик методу виводу всіх непарних елементів масиву
        printOddArrayValues(argArray);
    }

    public static void main(String[] args) {
        int []  userArray = initArrayByRandom();   // Ініціалізація через метод

        // Виклик методу виводу результату
        answerOutput(userArray);
        /*
            Вивід:
            Введіть бажаний розмір масиву:
            15
            Максимальне значення массиву: 996
            Мінімальне значення масиву: 47
            Сумма всіх елементів масиву: 8453
            Середнє арефметичне значення всіх елементів масиву: 563
            Всі непарні елементи масиву: 47 959 643 713 73 511 429
         */
    }
}
