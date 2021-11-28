package HW2_3.Vehicle;

public class Plane extends Vehicle{
    private double altitude;
    private int passengersAmount;

    public Plane(double coordX, double coordY, int price, int speed, int year, double altitude, int passengersAmount) {
        super(coordX, coordY, price, speed, year);
        this.altitude = altitude;
        this.passengersAmount = passengersAmount;
    }

    @Override
    public void printAllVehicleInfo() {
        System.out.println("Літак");
        System.out.println("Координати X :" + super.getCoordX());
        System.out.println("Координати Y :" + super.getCoordY());
        System.out.println("Ціна :" + super.getPrice());
        System.out.println("Швидкість :" + super.getSpeed());
        System.out.println("Рік випуску :" + super.getYear());
        System.out.println("Висота:" + altitude);
        System.out.println("Кількість пасажирів: " + passengersAmount);
    }
}
