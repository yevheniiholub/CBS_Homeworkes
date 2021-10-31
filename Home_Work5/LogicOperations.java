package Home_Work5;

public class LogicOperations {
    /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс LogicOperations.
        Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
        Выполните и рассчитайте результат следующих операций для этих переменных:
         x += y >> x++ * z;
         z = ++x & y * 5;
         y /= x + 5 | z;
         z = x++ & y * 5;
         x = y << x++ ^ z;
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        x += y >> x++ * z;
        z = ++x & y * 5;
        y /= x + 5 | z;
        z = x++ & y * 5;
        x = y << x++ ^ z;

        System.out.printf("x = %d\ny = %d\nz = %d\n", x, y, z);

        /*
            Вивід:
            x = 0
            y = 0
            z = 0
        */
    }
}
