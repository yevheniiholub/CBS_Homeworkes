package Additional_task_Inheritance_and_polymorphism.Task2.Transport;

/*
 * Інтерфейс транспорту
 */
public interface Transport {
    void move(double xDeltaCoord, double yDeltaCoord);  // Пересування до координат
    int calculateLoadedWeight(int passengersWeight);    // Розрахунок повної ваги нагруженого трансорту
}
