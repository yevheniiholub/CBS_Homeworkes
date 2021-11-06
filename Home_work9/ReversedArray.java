package Home_work9;

import java.util.Scanner;

public class ReversedArray {
    /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс ReversedArray.
        Требуется:
        1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
        целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
        порядке).
        2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
        часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
        размерностью, которая соответствует значению аргумента count.
        Если аргумент count содержит значение больше чем количество элементов, которые входят в
        выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
        то при формировании нового массива размерностью в count, заполните единицами те элементы,
        которые не были скопированы из исходного массива.
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
     * Створення нового массиву розміром count, який починається з array[index]
     */
    public static int [] subArray(int [] array, int index, int count){
        int [] userArray = new int[count];

        for (int i = 0; i < count; i++, index++){
            if (index < array.length){              // Якщо index в межах масиву
                userArray[i] = array[index];        // Присвоюємо масиву значення аргументного масиву
            }
            else{                                   // Якщо за межами
                userArray[i] = 1;                   // присвоюємо одиницю
            }
        }
        return userArray;
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
        int     userSize;
        int     userStartPoint;
        Scanner userInput;

        // Вивід оригінального згенерованого масиву
        System.out.println("Згенерований масив:");
        printArray(userArray);

        // Вивід інвертованого масиву
        System.out.println("Інаертованимй масив:");
        printArray(myReverse(userArray));

        // Прохання ввести дані для генерації новго масиву зі старого
        userInput = new Scanner(System.in);
        System.out.println("Введіть розмір нового масиву:");
        userSize = userInput.nextInt();

        userInput = new Scanner(System.in);
        System.out.println("Введіть стартову точку для копіювання:");
        userStartPoint = userInput.nextInt();

        // Вивід нового масиву
        System.out.println("Новий масив:");
        printArray(subArray(userArray, userStartPoint, userSize));

        /*
            Введіть бажаний розмір масиву:
            10
            Згенерований масив:
            625 786 497 946 58 117 254 65 229 555
            Інаертованимй масив:
            555 229 65 254 117 58 946 497 786 625
            Введіть розмір нового масиву:
            5
            Введіть стартову точку для копіювання:
            8
            Новий масив:
            229 555 1 1 1
         */
    }
}
