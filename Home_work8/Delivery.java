package Home_work8;

import java.util.Scanner;

public class Delivery {
    /*
        Задание 3
        Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует
        возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
        Используя IntelliJ IDEA, создайте класс Delivery.
        Напишите программу, которая будет рассчитывать и выводить на экран количество возможных вариантов
        доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью рекурсии.
        Объясните, почему не рекомендуется использовать рекурсию для расчета факториала. Укажите слабые
        места данного подхода.
     */

    /*
     *  Зчитування значення користувача
     */
    public static int getUserInt(){
        Scanner  userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    /*
     *  Обчислення кількості маршрутів
     */
    public static int getRouteCount(int argClientCount){
        if (argClientCount - 1 > 0){
            return (argClientCount * getRouteCount(argClientCount - 1));    // Рекурсія: факторіал
        }
        return 1;
    }

    public static void main(String[] args) {
        int userNumber;

        System.out.println("Введіть кількість клієнтів :");
        userNumber = getUserInt();

        // Перевірка валідності вводу користувача
        if (userNumber <= 0){
            System.out.println("Некорректно введена кількість клієнтів");
        }
        else{
            System.out.printf("Кількість маршрутів: %d\n", getRouteCount(userNumber));
        }
        /*
            Введіть кількість клієнтів :
            5
            Кількість маршрутів: 120
         */
    }
}
