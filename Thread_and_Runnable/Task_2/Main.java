package Thread_and_Runnable.Task_2;

/*
    Задание 2
    Задержка потока.
    Необходимо создать 3 потока, каждых из этих потоков запустить (например: main, second, first), и когда эти
    потоки успешно отработают – вывести на экран сообщение (завершение потом first, second и main).
 */

import java.util.ArrayList;
import java.util.List;

class someThreadClass implements Runnable {
    public someThreadClass() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
        }
    }
}

public class Main {

    public static void removeDeadThread(Thread thread, List<Thread> threads){
        if (!thread.isAlive()){
            System.out.println("Thread \"" + thread.getName() + "\" is finished!");
            threads.remove(thread);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new someThreadClass());
        Thread thread2 = new Thread(new someThreadClass());
        Thread thread3 = new Thread(new someThreadClass());
        List<Thread> threads = new ArrayList<>();

        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);

        for (Thread tempThread : threads){
            tempThread.start();
        }

        while (threads.size() > 1){
            removeDeadThread(thread1, threads);
            removeDeadThread(thread2, threads);
            removeDeadThread(thread3, threads);
        }
    }
}
