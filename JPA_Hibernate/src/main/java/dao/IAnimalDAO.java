package dao;

import entity.Animal;

public interface IAnimalDAO {
    void add(Animal newAnimal);
    boolean delete(Animal removeAnimal);
    Animal get(int animalID);
    void update(Animal updAnimal);
}
