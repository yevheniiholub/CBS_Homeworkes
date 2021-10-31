package Practice_lesson5;

public class Task2 {
    /*
        Задание **
        Написать таблицу истинности кодом для знаков
        ^, |, &.
        Что такое таблица истинности, если вы не знаете - загуглить самостоятельно.
     */
    public static void main(String[] args) {
        byte a;
        byte b;

        System.out.printf("|| A || B || A ^ B || A | B || A & B ||\n");
        a = 0;
        b = 0;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", a, b, (a ^ b) , (a | b), (a & b));
        a = 0;
        b = 1;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", a, b, (a ^ b) , (a | b), (a & b));
        a = 1;
        b = 0;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", a, b, (a ^ b) , (a | b), (a & b));
        a = 1;
        b = 1;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", a, b, (a ^ b) , (a | b), (a & b));
    }
}
