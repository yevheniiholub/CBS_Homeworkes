package Lambda_expressions.Task_3;

/*
    Задание 3
    Создать класс Book, сделать 3 поля и соответствующие методы. Необходимо реализовать замыкание анонимного
    класса и лямбда-выражения
 */

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Shevchenko", 320, "Kobzar");
        String message = "Книга має сторінок :";
        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer a) {
                return message + a;
            }
        };
        System.out.println(function.apply(book.getPagesCount()));
    }
}
