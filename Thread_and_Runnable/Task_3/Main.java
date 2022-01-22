package Thread_and_Runnable.Task_3;

/*
    Задание 3
    Демонстрация приоритетов.
    Создать 2 класса PriorityRunner и PriorityThread.
    Запустить 3 потока с приоритетами (min, max, norm).
    При помощи цикла for выведем на экран значения от 1 до 50 и укажем, какой именно поток данную операцию
    делает.
 */

public class Main {
    public static void main(String[] args) {
        PriorityThread ptVar1 = new PriorityThread(new PriorityRunner(41, 51));
        PriorityThread ptVar2 = new PriorityThread(new PriorityRunner(16, 40));
        PriorityThread ptVar3 = new PriorityThread(new PriorityRunner(1, 15));

        ptVar1.setPriority(Thread.MIN_PRIORITY);
        ptVar2.setPriority(Thread.NORM_PRIORITY);
        ptVar3.setPriority(Thread.MAX_PRIORITY);

        ptVar3.start();
        ptVar2.start();
        ptVar1.start();
    }
}
