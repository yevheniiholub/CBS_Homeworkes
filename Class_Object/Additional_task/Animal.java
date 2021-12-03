package Class_Object.Additional_task;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean isWithTail;

    public Animal(String name, int age, boolean isWithTail) {
        this.name = name;
        this.age = age;
        this.isWithTail = isWithTail;
    }

    @Override
    public String toString() {
        return "Имя: " + name
                + ", возраст: " + age
                + ", хвост: " + (isWithTail?"да": "нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isWithTail == animal.isWithTail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isWithTail);
    }
}
