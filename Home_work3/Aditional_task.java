package Home_work3;

public class Aditional_task {
    public static void main(String[] args) {
    /*
        Задание
        Используя IntelliJ IDEA, создайте проект c классом main.
        Создайте две целочисленные переменные и выведите на экран результаты всех арифметических
        операций над этими двумя переменными.
     */
        int a = 24;
        int b = 14;

        System.out.printf("first number = %d\nsecond number = %d\noperation -\nresult = %d\n", a, b, (a - b));
        System.out.printf("first number = %d\nsecond number = %d\noperation +\nresult = %d\n", a, b, (a + b));
        System.out.printf("first number = %d\nsecond number = %d\noperation *\nresult = %d\n", a, b, (a * b));
        System.out.printf("first number = %d\nsecond number = %d\noperation /\nresult = %d\n", a, b, (a / b));
        System.out.printf("first number = %d\nsecond number = %d\noperation %% \nresult = %d\n", a, b, (a % b));
    }
}
