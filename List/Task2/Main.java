package List.Task2;

public class Main {
    /*
    Задание 2
    Используя Intelij IDEA создать проект, пакет.
    Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
    element).
    Вывести список в консоль.
     */
    public static void initZoo(Zoo argZoo){
        final String [] animals = { "Zebra", "Lion", "Tiger", "Monkey", "Hippo", "Elephant", "Giraffe", "Alligator"};

        for (int i = 0; i < animals.length; i++) {
            argZoo.addAnimal(i, animals[i]);
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        initZoo(zoo);
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
         */
    }
}
