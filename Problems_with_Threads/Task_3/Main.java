package Problems_with_Threads.Task_3;

/*
    Задание 3
    Изменить задание №2. Всеми возможными способами (которые Вы знаете) решить проблему взаимной
    блокировки.
 */

class CustomThread1 extends Thread {
    Thread externalThread;

    @Override
    public synchronized void run() {
        System.out.println("CustomThread1 is launched");
        System.out.println("CustomThread1 is finished");
    }

    public void setExternalThread(Thread externalThread) {
        this.externalThread = externalThread;
    }
}

class CustomThread2 extends Thread {
    Thread externalThread;

    @Override
    public synchronized void run() {
        System.out.println("CustomThread1 is launched");
        System.out.println("CustomThread1 is finished");
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
