package Anonymous_classes_and_Enums.Task_2;

/*
    Задание 2
    Создайте проект, используя IntelliJ IDEA.
    Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
    целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
    должен возвращать название экземпляра и возраст животного.
 */

public class Main {
    public static void main(String[] args) {
        Animals animal;

        animal = Animals.elephant;
        System.out.println(animal);

        animal = Animals.monkey;
        System.out.println(animal);

        animal = Animals.tiger;
        System.out.println(animal);

        animal = Animals.lion;
        System.out.println(animal);

        /*
            out
            elephant age is 15
            monkey age is 10
            tiger age is 12
            lion age is 18
         */
    }
}
