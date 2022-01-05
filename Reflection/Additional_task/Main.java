package Reflection.Additional_task;

/*
    Задание
    Создайте 2 класса, Animal и Cat.
    В классе Animal инициализируйте 3 поля различных модификаторов.
    В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей.

 */

import java.lang.reflect.Field;

public class Main {

    public static void changeAnimal(Cat cat) throws IllegalArgumentException, IllegalAccessException {
        Class classVar = cat.getClass().getSuperclass();
        Field[] fields = classVar.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(int.class)) {
                field.setAccessible(true);
                field.set(cat, 123);
            } else if (field.getType().equals(String.class)) {
                field.setAccessible(true);
                field.set(cat, "Barney");
            } else if (field.getType().equals(boolean.class)) {
                field.setAccessible(true);
                field.set(cat, true);
            }
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat(14, "Bobby", false);

        System.out.println("\u001B[34m" + "Before changes: " + "\u001B[0m");
        System.out.println("Age :" + cat.getAge());
        System.out.println("Name :" + cat.getName());
        System.out.println("Hungry :" + cat.isHungry());
        try {
            changeAnimal(cat);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\u001B[34m" + "After changes: " + "\u001B[0m");
        System.out.println("Age :" + cat.getAge());
        System.out.println("Name :" + cat.getName());
        System.out.println("Hungry :" + cat.isHungry());
    }
}
