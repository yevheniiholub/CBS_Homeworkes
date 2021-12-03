package Exceptions.Task_2;

public class Worker {
    private String name;
    private String position;
    private Integer year;

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
