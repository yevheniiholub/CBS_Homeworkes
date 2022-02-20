package logic;

import dao.impl.AnimalDAO;
import entity.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalDAO animalDAO = new AnimalDAO();

        Animal firstAnimal = Animal.builder()
                .id(1)
                .name("Rex")
                .tail(true)
                .build();

        Animal secondAnimal = Animal.builder()
                .id(2)
                .name("Tom")
                .tail(true)
                .build();

        animalDAO.add(firstAnimal);
        animalDAO.add(secondAnimal);
        Animal receivedAnimal = animalDAO.get(1);
        System.out.println(receivedAnimal);
    }
}
