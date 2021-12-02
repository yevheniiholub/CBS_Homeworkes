package Exceptions.Task_3;

/*
    Задание 3
    Создайте проект, используя IntelliJ IDEA.
    Требуется: Описать класс с именем Price, содержащую следующие поля:
     название товара;
     название магазина, в котором продается товар;
     стоимость товара в гривнах.
    Написать программу, выполняющую следующие действия:
     ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
    быть упорядочены в алфавитном порядке по названиям магазинов);
     вывод на экран информации о товарах, продающихся в магазине, название которого введено с
    клавиатуры (если такого магазина нет, вывести исключение).
 */

import java.util.Scanner;

public class Main {

    /*
     *  Збір інформації про товари
     */
    public static void collectProductInfo(Price [] prices) throws StoreSortException{
        String tempProductName;
        String tempStoreName;
        Integer tempPrice;

        for (int i = 0; i < prices.length; i++) {
            // Зчитування назви товара
            System.out.println("Введіть назву товара:");
            tempProductName = new Scanner(System.in).next();

            // Зчитування назви магазину
            System.out.println("Введіть назву магазина:");
            tempStoreName = new Scanner(System.in).next();

            // Перевірка лічильника чи знаходиться він не на першому елементі, щоб наступною перевіркою не вийти
            // за межі масиву
            if (i > 0) {
                // Перевіряємо чи введений магазин відповідає алфавітному порядку, якщо ні - тоді підіймаємо помилку
                if (tempStoreName.compareToIgnoreCase(prices[i - 1].getStoreName()) < 0) {
                    throw new StoreSortException("Магазин введений не по алфавітному порядку!");
                }
            }

            // Зчитування ціни товару
            System.out.println("Введіть ціну товару в грн");
            tempPrice = new Scanner(System.in).nextInt();

            // Створення об'єкту згідно зчитаних вище даних
            prices[i] = new Price(tempProductName, tempStoreName, tempPrice);
        }
    }

    /*
     *  Пошук магазину і вивід наявних товарів
     */
    public static void findAndShowStoreProducts(Price [] prices) throws StoreNotExistException{
        String destinationStore;
        boolean storeNameIsValid;

        // Зчитування магазину який необхідно знайти
        System.out.println("Введіть магазин щоб побачити наявні товари:");
        destinationStore = new Scanner(System.in).next();

        // Шукаємо введений магазин в переліку товарів
        // Ініціалізуємо флаг, який сигналізуватиме про те що даний магазин існує серед переліку товарів
        storeNameIsValid = false;
        for (Price singlePrice : prices) {
            if (singlePrice.getStoreName().equalsIgnoreCase(destinationStore)){
                // Якщо магазин знайдено, то ставимо флаг у відповідне положення і перериваємо цикл пошуку
                storeNameIsValid = true;
                break;
            }
        }

        // Якщо магазин було найдено серед переліку товарів, то виводимо товари які прописані в цьому магазині
        if (storeNameIsValid) {
            for (Price singlePrice : prices) {
                if (singlePrice.getStoreName().equalsIgnoreCase(destinationStore)) {
                    System.out.println("Назва товару: " + singlePrice.getProductName());
                    System.out.println("Ціна: " + singlePrice.getPrice() + " грн");
                }
            }
        }
        // Якщо магазин не вдалося знайти, то підіймаємо помилку
        else{
            throw new StoreNotExistException("Такого магазину не існує в переліку!");
        }
    }

    public static void main(String[] args) {
        Price [] prices = new Price[2];

        try {
            collectProductInfo(prices);             // Введення даних
            findAndShowStoreProducts(prices);       // Пошук і вивід товарів
        }
        catch (StoreSortException | StoreNotExistException e){
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }
}
