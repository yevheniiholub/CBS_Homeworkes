package Home_work_Classes_and_Objects.Task3;

/*
    Задание 3
    Используя Intelij IDEA создать проект, пакет.
    (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
    Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
    Перегрузить конструкторы.
    Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
 */

public class Main {
    Machine defaultMachine = new Machine();
    Machine oneArgMachine = new Machine(2000);
    Machine twoArgMachine = new Machine(2000, 220.0d);
    Machine threeArgMachine = new Machine(2000, 220.0d, 1045);
    Machine fourArgMachine = new Machine(2000, 220.0d, 1045, "White");
}
