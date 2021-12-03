package Class_Object.Additional_task;

/*
    Задание
    Используя Intelij IDEA создать проект, пакет.
    Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод
    toString, что бы вывод был сдедующим
    «Имя: Васька, возраст: 45, хвост: нет».
    В классе Animal переопределить методы equals & hashCode.
 */

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);
        Animal animalNew = new Animal("Васька", 45, true);

        System.out.println(animal);                                                        // toString()
        System.out.println("animal.equals(animalNew) = " + animal.equals(animalNew));      // equals()
        System.out.println("animal.hashCode() = " + animal.hashCode());                    // hashCode()

        /*
            Имя: Васька, возраст: 45, хвост: нет
            animal.equals(animalNew) = false
            animal.hashCode() = -680046874
         */
    }
}
