package Problems_with_Threads.Additional_task;

/*
    Задание
    Создайте поток-демон и выведите про него как можно больше информации.
 */

class DaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            // Запускаємо нескінченний цикл, щоб показати, що програма завершить свою роботу не дивлячись на те що
            // демон не завершив свою роботу
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();


        daemonThread.setDaemon(true);// Якщо закоментувати присвоєння потоку статусу демона, то програма не закінчить
                                     //своє виконання поки поток повністю не відпрацює
        daemonThread.start();
        daemonThread.setName("DaemonThreadOfMain");
        System.out.println("Name: " + daemonThread.getName());
        System.out.println("ID: " + daemonThread.getId());
        if (daemonThread.isDaemon()){
            System.out.println("Thread is daemon");
        }
        System.out.println("Priotity " + daemonThread.getPriority());
        if (daemonThread.isAlive()){
            System.out.println("Daemon thread is alive");
        }
        else{
            System.out.println("Daemon thread is dead!");
        }
    }
}
