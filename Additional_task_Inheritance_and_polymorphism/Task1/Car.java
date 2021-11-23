package Additional_task_Inheritance_and_polymorphism.Task1;

/*
 * Класс машина
 */
public class Car extends EngineTransport{
    private int wheelsCount;        // Кількість колес
    private String color;           // Колір

    // Конструктор
    public Car() {
    }

    /*
     * Геттери і сеттери
     */

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
