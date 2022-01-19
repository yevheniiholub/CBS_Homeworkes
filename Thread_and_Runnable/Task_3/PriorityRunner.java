package Thread_and_Runnable.Task_3;

public class PriorityRunner implements Runnable {
    private int start;
    private int end;

    public PriorityRunner(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            System.out.println(i + " ");
        }
    }
}
