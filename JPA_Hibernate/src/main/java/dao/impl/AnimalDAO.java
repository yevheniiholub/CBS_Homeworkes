package dao.impl;

import dao.IAnimalDAO;
import entity.Animal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AnimalDAO implements IAnimalDAO {
    EntityManagerFactory emf;
    EntityManager em;

    public AnimalDAO() {
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    @Override
    public void add(Animal newAnimal) {
        em.getTransaction().begin();
        em.merge(newAnimal);
        em.getTransaction().commit();
        emf.close();
    }

    @Override
    public boolean delete(Animal removeAnimal) {
        return false;
    }

    @Override
    public Animal get(int animalID) {
        em.getTransaction().begin();
        Animal findAnimal = em.find(Animal.class, animalID);
        em.getTransaction().commit();
        emf.close();
        return findAnimal;
    }

    @Override
    public void update(Animal updAnimal) {

    }
}
