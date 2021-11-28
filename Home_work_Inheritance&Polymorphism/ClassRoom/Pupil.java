package HW2_3.ClassRoom;

public class Pupil {
    private int time;
    private int averageMark;
    private String pupilName;

    public Pupil() {
        time = 50;
        averageMark = 0;
        pupilName = "Pupil";
    }

    public int getAverageMark() {
        return averageMark;
    }

    public String getPupilName() {
        return pupilName;
    }

    public void study(){
        time -= 10;
        averageMark += 1;
        System.out.println("За тиждень було витрачено на начання 10 годин");
    }

    void read(){
        time -= 10;
        averageMark += 1;
        System.out.println("За тиждень було витрачено на читання 10 годин");
    }

    void write(){
        time -= 10;
        averageMark += 1;
        System.out.println("За тиждень було витрачено на письмо 10 годин");
    }

    void relax(){
        System.out.println("За тиждень було витрачено на відпочинок " + time + " годин");
    }
}
