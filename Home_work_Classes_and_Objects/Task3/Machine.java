package Home_work_Classes_and_Objects.Task3;

public class Machine {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Machine(){
    }

    public Machine(int year) {
        this.year = year;
    }

    public Machine(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Machine(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Machine(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
