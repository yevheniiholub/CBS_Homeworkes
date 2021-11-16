package Home_work_Classes_and_Objects.Task4;

/*
    Задание 4
    Используя Intelij IDEA создать проект, пакет.
    (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
    Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
    Перегрузить конструкторы вызывая конструктор из конструктора.
    Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
 */

public class Main {
    Car defaultMachine = new Car();
    Car oneArgMachine = new Car(2000);
    Car twoArgMachine = new Car(2000, 220.0d);
    Car threeArgMachine = new Car(2000, 220.0d, 1045);
    Car fourArgMachine = new Car(2000, 220.0d, 1045, "White");
}
