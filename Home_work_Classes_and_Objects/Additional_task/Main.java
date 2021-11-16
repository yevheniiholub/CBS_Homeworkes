package Home_work_Classes_and_Objects.Additional_task;

/*
    Задание
    Используя Intelij IDEA создать проект, пакет.
    Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
    должен принимать радиус и используя PI посчитать площадь круга.
    Создать класс Main, где запустить данный метод.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);                         // Ініціалізація сканеру
        System.out.println("Введіть радіус кола:");                         // Прохання ввести радіус
        System.out.println(MyArea.areaOfCircle(userInput.nextDouble()));    // Вивід результату з викликом статичного
                                                                            // методу обчислення площі кругу
    }

    /*
        Вивід:
        Введіть радіус кола:
        52
        8494.8665353068
     */
}
