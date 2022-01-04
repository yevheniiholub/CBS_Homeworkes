package Reflection.Additional_task;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class Cat {
    public void changeAnimal(Animal animal){
        Class classVar = animal.getClass();
        Field [] fields = classVar.getDeclaredFields();

        try {
            fields[0].setAccessible(true);
            fields[0].set(animal, 123);

            fields[1].setAccessible(true);
            fields[1].set(animal, "Barney");

            fields[2].setAccessible(true);
            fields[2].set(animal, true);
        }
        catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
