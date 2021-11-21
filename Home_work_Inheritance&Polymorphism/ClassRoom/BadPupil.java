package HW2_3.ClassRoom;

public class BadPupil extends Pupil{
    private int time;
    private int averageMark;
    private String pupilName;

    public BadPupil() {
        time = 50;
        averageMark = 0;
        pupilName = "BadPupil";
    }

    @Override
    public String getPupilName() {
        return pupilName;
    }

    @Override
    public int getAverageMark() {
        return averageMark;
    }

    @Override
    public void study() {
        time -= 10;
        averageMark += 1;
        System.out.println("За тиждень було витрачено на начання 10 годин");
    }

    @Override
    void read() {
        time -= 10;
        averageMark += 1;
        System.out.println("За тиждень було витрачено на читання 10 годин");
    }

    @Override
    void write() {
        System.out.println("За тиждень було витрачено на письмо 0 годин");
    }

    @Override
    void relax() {
        System.out.println("За тиждень було витрачено на відпочинок " + time + " годин");
    }

}
