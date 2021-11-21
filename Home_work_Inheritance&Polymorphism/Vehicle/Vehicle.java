package HW2_3.Vehicle;

public abstract class Vehicle {
    private double coordX;
    private double coordY;
    private int price;
    private int speed;
    private int year;

    public Vehicle(double coordX, double coordY, int price, int speed, int year) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public abstract void printAllVehicleInfo();
}
