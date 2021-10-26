package Home_work3;

public class Circle {
    public static void main(String[] args) {
        /*
            Задание 3
            Используя IntelliJ IDEA, создайте класс Circle.
            Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r. Используя
            формулу πR2, вычислите площадь круга и выведите результат на экран.
        */

        // Ініціалізація
        final double PI = 3.141592653d;
        double r = 35.0d;

        // Розрахунок і вивід
        System.out.println(PI * Math.pow(r, 2));

        // Вивід >: 3848.450999925
    }
}
