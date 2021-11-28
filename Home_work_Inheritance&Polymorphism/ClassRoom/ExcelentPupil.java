package HW2_3.ClassRoom;

public class ExcelentPupil extends Pupil{
    private int time;
    private int averageMark;
    private String pupilName;

    public ExcelentPupil() {
        time = 50;
        averageMark = 0;
        pupilName = "ExcelentPupil";
    }

    @Override
    public int getAverageMark() {
        return averageMark;
    }

    @Override
    public String getPupilName() {
        return pupilName;
    }

    @Override
    public void study() {
        time -= 20;
        averageMark += 2;
        System.out.println("За тиждень було витрачено на начання 20 годин");
    }

    @Override
    void read() {
        time -= 20;
        averageMark += 2;
        System.out.println("За тиждень було витрачено на читання 20 годин");
    }

    @Override
    void write() {
        time -= 10;
        averageMark += 1;
        System.out.println("За тиждень було витрачено на письмо 10 годин");
    }

    @Override
    void relax() {
        System.out.println("За тиждень було витрачено на відпочинок " + time + " годин");
    }
}
