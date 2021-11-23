package Additional_task_Inheritance_and_polymorphism.Task2.Transport;

/*
 * Класс автобусу
 */
public class Bus implements Transport{
    private double xAxisCoordinate;     // Координата Х
    private double yAxisCoordinate;     // Координата У
    private int emptyBusWeight;         // Вага пустого автобуса
    private int passengersCount;        // Кількість мість для пасажирів
    private int maxLoadedWeight;        // Максимальна допустима вага
    private int busLength;              // Довжина автобуса
    private String startCity;           // Місто відправки
    private String destinationCity;     // Місто кінцевої зупинки

    // Конструктор
    public Bus() {
    }

    // Реалізація методу інтерфейсу пересування
    @Override
    public void move(double xDeltaCoord, double yDeltaCoord) {
        xAxisCoordinate += xDeltaCoord;
        yAxisCoordinate += yDeltaCoord;
    }

    // Реалізація методу інтерфейсу розрахунку ваги навантаженого автобуса
    @Override
    public int calculateLoadedWeight(int passengersWeight) {
        return emptyBusWeight += passengersWeight;
    }

    /*
     * Геттери і сеттери
     */

    public double getxAxisCoordinate() {
        return xAxisCoordinate;
    }

    public void setxAxisCoordinate(double xAxisCoordinate) {
        this.xAxisCoordinate = xAxisCoordinate;
    }

    public double getyAxisCoordinate() {
        return yAxisCoordinate;
    }

    public void setyAxisCoordinate(double yAxisCoordinate) {
        this.yAxisCoordinate = yAxisCoordinate;
    }

    public int getEmptyBusWeight() {
        return emptyBusWeight;
    }

    public void setEmptyBusWeight(int emptyBusWeight) {
        this.emptyBusWeight = emptyBusWeight;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public int getMaxLoadedWeight() {
        return maxLoadedWeight;
    }

    public void setMaxLoadedWeight(int maxLoadedWeight) {
        this.maxLoadedWeight = maxLoadedWeight;
    }

    public int getBusLength() {
        return busLength;
    }

    public void setBusLength(int busLength) {
        this.busLength = busLength;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
}
