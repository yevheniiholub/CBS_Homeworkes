package dao.impl;

import dao.IAnimalDAO;
import entity.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnimalDAO implements IAnimalDAO {
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
    public void add(Animal newAnimal) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(newAnimal);
        transaction.commit();
        session.close();
    }

    @Override
    public boolean delete(Animal removeAnimal) {
        return false;
    }

    @Override
    public Animal get(int animalID) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Animal animal = session.get(Animal.class, animalID);
        transaction.commit();
        session.close();
        return animal;
    }

    @Override
    public void update(Animal updAnimal) {

    }
}
