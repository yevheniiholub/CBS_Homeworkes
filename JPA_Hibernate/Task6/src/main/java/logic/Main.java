package logic;

import dao.IBookHelper;
import dao.impl.BookHelper;
import entity.Book;

/*
    Задание 6
    Создать Gradle-проект и настроить его под Hibernate. Взять пример ex_003_hibernate_get_and_insert.
    Получить объект Book и коллекцию объектов. Получить конкретный Book по id. Добавить Новый Book. И
    это все реализовать в классе BookHelper
 */

public class Main {
    public static void main(String[] args) {
        IBookHelper bh = new BookHelper();

        Book firstBook = new Book().builder()
                .name("BookOne")
                .author_id(1)
                .build();

        Book secondBook = new Book().builder()
                .name("BookTwo")
                .author_id(2)
                .build();

        Book thirdBook = new Book().builder()
                .name("BookThree")
                .author_id(3)
                .build();

        bh.add(firstBook);
        bh.add(secondBook);
        bh.add(thirdBook);

        System.out.println(bh.getAll());
        System.out.println(bh.get(2));
    }
}
