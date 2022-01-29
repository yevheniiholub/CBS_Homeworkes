package Problems_with_Threads.Task_2;

/*
    Задание 2
    Создать 2 класса. Реализовать взаимную блокировку(deadlock) этих классов
 */

class CustomThread1 extends Thread {
    Thread externalThread;

    @Override
    public void run() {
        System.out.println("CustomThread1 is launched");
        try {
            externalThread.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("CustomThread1 is fimished");
    }

    public void setExternalThread(Thread externalThread) {
        this.externalThread = externalThread;
    }
}

class CustomThread2 extends Thread {
    Thread externalThread;

    @Override
    public void run() {
        System.out.println("CustomThread1 is launched");
        try {
            externalThread.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("CustomThread1 is fimished");
    }

    public void setExternalThread(Thread externalThread) {
        this.externalThread = externalThread;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomThread1 custom1 = new CustomThread1();
        CustomThread2 custom2 = new CustomThread2();

        custom1.setExternalThread(custom2);
        custom2.setExternalThread(custom1);
        custom1.start();
        custom2.start();

    }
}
