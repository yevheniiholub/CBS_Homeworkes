package Home_work9;

import java.util.Scanner;

public class UserArray {
    /*
        Задание 4
        Используя IntelliJ IDEA, создайте класс UserArray.
        Требуется:
        Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
        на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
        Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
        аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
        метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
        элементы получаемого массива в качестве первого аргумента должны скопироваться в новый массив
        начиная с индекса 1.
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
     * Розширення масиву на один елемент
     */
    public static int [] extendArray(int [] argArray){
        int [] resultArray = new int[argArray.length + 1]; // створення нового массиву на елемент 1 більше

        for(int i = 0; i < argArray.length; i++){
            resultArray[i] = argArray[i];                  // копіювання старого масиву в новий
        }

        return resultArray;
    }

    /*
     * Зміщення масиву на один елемент і вставка нового числа в початок масиву
     */
    public static void pushIntToArray(int [] argArray, int argValue){

        // Здвиг масиву
        for (int i = argArray.length - 1 ; i > 0; i--){
            argArray[i] = argArray[i - 1];
        }

        // Вставка нового елементу
        argArray[0] = argValue;
    }

    /*
     * Вивід масиву
     */
    public static void printArray(int [] argArray){
        for (int j : argArray) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int []  userArray = initArrayByRandom();
        int     newUserValue;
        Scanner userInput;

        // Безкінечний цикл
        for (;;){
            // Вивід теперішнього стану масиву
            printArray(userArray);

            // Зчитуємо значення нового елементу масива від користувача
            System.out.println("Введіть значення нового елементу масиву (щоб вийти введіть \"1234567890\")");
            userInput = new Scanner(System.in);
            newUserValue = userInput.nextInt();

            // Розширюємо і записуємо нове значення в масив
            userArray = extendArray(userArray);
            pushIntToArray(userArray, newUserValue);

            // Перевірка на умову для перервання циклу
            if (newUserValue == 1234567890){
                break;
            }
        }
        /*
            Вивід:
            Введіть бажаний розмір масиву:
            5
            348 352 116 796 325
            Введіть значення нового елементу масиву (щоб вийти введіть "1234567890")
            45
            45 348 352 116 796 325
            Введіть значення нового елементу масиву (щоб вийти введіть "1234567890")
            13
            13 45 348 352 116 796 325
            Введіть значення нового елементу масиву (щоб вийти введіть "1234567890")
            1234567890
         */
    }
}
