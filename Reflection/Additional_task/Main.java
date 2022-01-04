package Reflection.Additional_task;

/*
    Задание
    Создайте 2 класса, Animal и Cat.
    В классе Animal инициализируйте 3 поля различных модификаторов.
    В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей.

 */

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(14, "Bobby", false);
        Cat cat = new Cat();

        System.out.println("\u001B[34m" + "Before changes: " + "\u001B[0m");
        System.out.println("Age :" + animal.getAge());
        System.out.println("Name :" + animal.getName());
        System.out.println("Hungry :" + animal.isHungry());

        cat.changeAnimal(animal);

        System.out.println("\u001B[34m" + "After changes: " + "\u001B[0m");
        System.out.println("Age :" + animal.getAge());
        System.out.println("Name :" + animal.getName());
        System.out.println("Hungry :" + animal.isHungry());
    }
}
