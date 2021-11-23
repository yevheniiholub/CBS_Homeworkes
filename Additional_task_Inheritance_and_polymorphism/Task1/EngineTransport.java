package Additional_task_Inheritance_and_polymorphism.Task1;
/*
 * Клас двигуновий транспорт
 */
public class EngineTransport extends Transport{
    private boolean fuelOrDiesel;     // Дизель чи бензин
    private int engineVolume;         // Об'єм двигуна

    // Конструктор
    public EngineTransport() {
    }

    /*
        Геттери і сеттери
     */
    public boolean isFuelOrDiesel() {
        return fuelOrDiesel;
    }

    public void setFuelOrDiesel(boolean fuelOrDiesel) {
        this.fuelOrDiesel = fuelOrDiesel;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
}
