package List.Task3;

/*
    Задание 3
    Используя Intelij IDEA создать проект, пакет.
    Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
 */

import List.Task2.Zoo;

public class Main {
    public static void initZoo(Zoo argZoo){
        final String [] animals = { "Zebra", "Lion", "Tiger", "Monkey", "Hippo", "Elephant", "Giraffe", "Alligator"};

        for (int i = 0; i < animals.length; i++) {
            argZoo.addAnimal(i, animals[i]);
        }
    }

    public static void main(String[] args) {
        ZooWithDelete zoo = new ZooWithDelete();
        initZoo(zoo);
        zoo.printAnimals();

        zoo.removeAnimal(6);
        zoo.removeAnimal(4);
        zoo.removeAnimal(2);

        zoo.printAnimals();
        /*
                Out
                Zebra
                Lion
                Tiger
                Monkey
                Hippo
                Elephant
                Giraffe
                Alligator

                Zebra
                Lion
                Monkey
                Elephant
                Alligator
         */
    }
}
