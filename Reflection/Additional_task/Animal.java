package Reflection.Additional_task;

public class Animal {
    private int age;
    protected String name;
    boolean isHungry;

    public Animal(int age, String name, boolean isHungry) {
        this.age = age;
        this.name = name;
        this.isHungry = isHungry;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }
}
