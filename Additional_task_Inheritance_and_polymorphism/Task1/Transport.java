package Additional_task_Inheritance_and_polymorphism.Task1;

/*
 * Класс транспорт
 */
public class Transport {
    private int speed;                  // Швидкість
    private int passengersCount;        // Кількість місць для пасажирів

    // Конструктор
    public Transport() {
    }

    /*
     * Геттери і сеттери
     */
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }
}
