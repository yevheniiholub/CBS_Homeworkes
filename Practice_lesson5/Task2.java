package Practice_lesson5;

public class Task2 {
    /*
        Задание **
        Написать таблицу истинности кодом для знаков
        ^, |, &.
        Что такое таблица истинности, если вы не знаете - загуглить самостоятельно.
     */
    public static void main(String[] args) {
        byte variableA;
        byte variableB;

        System.out.printf("|| A || B || A ^ B || A | B || A & B ||\n");
        variableA = 0;
        variableB = 0;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", variableA, variableB,
                (variableA ^ variableB) , (variableA | variableB), (variableA & variableB));
        variableA = 0;
        variableB = 1;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", variableA, variableB,
                (variableA ^ variableB) , (variableA | variableB), (variableA & variableB));
        variableA = 1;
        variableB = 0;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", variableA, variableB,
                (variableA ^ variableB) , (variableA | variableB), (variableA & variableB));
        variableA = 1;
        variableB = 1;
        System.out.printf("|| %d || %d ||   %d   ||   %d   ||   %d   ||\n", variableA, variableB,
                (variableA ^ variableB) , (variableA | variableB), (variableA & variableB));
    }
}
