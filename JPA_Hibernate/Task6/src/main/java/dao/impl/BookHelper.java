package dao.impl;

import dao.IBookHelper;
import entity.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class BookHelper implements IBookHelper {
    private static SessionFactory sessionFactory;

    private static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();
        }
        return sessionFactory;
    }

    @Override
    public List<Book> getAll() {
        Session session = sessionFactory.openSession();
        Criteria cb = session.createCriteria(Book.class);
        List<Book> bookList = cb.list();
        session.close();
        return bookList;
    }

    @Override
    public void add(Book newBook) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(newBook);
        transaction.commit();
        session.close();
    }

    @Override
    public boolean delete(Book removeBook) {
        return false;
    }

    @Override
    public Book get(long bookID) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Book book = session.get(Book.class, bookID);
        transaction.commit();
        session.close();
        return book;
    }

    @Override
    public void update(Book updBook) {

    }
}
