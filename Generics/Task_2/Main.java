package Generics.Task_2;

/*
    Задание 2
    Создайте проект, используя IntelliJ IDEA.
    Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
    экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
    экземпляром, должен включать метод добавления элемента, индексатор для получения значения
    элемента по указанному индексу и свойство только для чтения для получения общего количества
    элементов.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("first");
        myList.add("second");
        myList.add("third");

        System.out.println("Кількість елементів в масиві = " + myList.getSize());
        System.out.println("Елемент під індексом 1 = " + myList.get(1));

    }
}
