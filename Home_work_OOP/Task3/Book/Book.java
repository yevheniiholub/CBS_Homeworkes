package Home_work_OOP.Task3.Book;

import Home_work_OOP.Task3.Author.Author;
import Home_work_OOP.Task3.Content.Content;
import Home_work_OOP.Task3.Title.Title;

public class Book {
    /*
        Задание 3
        Используя IDEA, создайте проект c пакетом.
        Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
        содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
        названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
        книги, имя автора и Содержание.
     */

    // Об'явлення і ініціалізація об'єтів
    public static Author userAuthor = new Author();
    public static Title userTitle = new Title();
    public static Content userContent = new Content();

    public static void show(){
        // Вивід через геттери
        System.out.println("Автор: " + userAuthor.getAuthorName());
        System.out.println("Заголовок: " + userTitle.getTitleName());
        System.out.println("Зміст: " + userContent.getContentStr());
    }

    public static void main(String[] args) {
        // Запоснення інформації через сеттери
        userAuthor.setAuthorName("Євгеній");
        userTitle.setTitleName("Якась книжка");
        userContent.setContentStr("Бла бла бла");

        // Виклик функції виводу інформації
        show();

        /*
            Вивід:
            Автор: Євгеній
            Заголовок: Якась книжка
            Зміст: Бла бла бла
         */
    }
}
