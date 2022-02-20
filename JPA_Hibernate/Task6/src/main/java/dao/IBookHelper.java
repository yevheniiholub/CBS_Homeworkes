package dao;

import entity.Book;

import java.util.List;

public interface IBookHelper {
    List<Book> getAll();
    void add(Book newBook);
    boolean delete(Book removeBook);
    Book get(long bookID);
    void update(Book updBook);
}
