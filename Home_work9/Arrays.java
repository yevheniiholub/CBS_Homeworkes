package Home_work9;

import java.util.Scanner;

public class Arrays {
    /*
        Задание
        Используя IntelliJ IDEA, создайте класс Arrays.
        Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном
        порядке.
     */

    /*
     * Ініціалізація массиву вказаним розміром
     */
    public static int [] initArrayByRandom(int size){
        int [] resultArray = new int [size];            // Ініціалізація масиву

        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = (int)(Math.random()*1000);     // Присвоєння кожному елементу довільного значення
        }
        return resultArray;
    }

    /*
     * Реверс массиву
     */
    public static int [] myReverse(int [] array){
        int [] reversedArray = new int[array.length];   // Створюємо масив той же розмірності що і аргумент

        // Для локального масиву створюємо лічильник який починається з нуля і кожну ітерацію інкреметується
        // Для масиву якйи прийшов як аргумент ініціалізуємо лічильник максимальни значення і кожну ітерацію
        // декрементуємо його. Значення масиву аргументу записуємо у відповідне значененя локального масиву
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--){
            reversedArray[i] = array[j];
        }
        return reversedArray;
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
        int [] userArray;

        userArray = initArrayByRandom(10);

        // Вивід оригінального масиву
        System.out.println("Оригінальний масив");
        printArray(userArray);

        // Вивід інвертованого масиву
        System.out.println("Інвертований масив");
        printArray(myReverse(userArray));

        /*
            Вивід:
            Оригінальний масив
            500 727 709 77 770 721 276 68 804 392
            Інвертований масив
            392 804 68 276 721 770 77 709 727 500
         */

    }
}
