package HW2_3.Vehicle;

public class Ship extends Vehicle{
    private int passengersAmount;
    private String port;

    public Ship(double coordX, double coordY, int price, int speed, int year, int passengersAmount, String port) {
        super(coordX, coordY, price, speed, year);
        this.passengersAmount = passengersAmount;
        this.port = port;
    }

    @Override
    public void printAllVehicleInfo() {
        System.out.println("Корабель");
        System.out.println("Координати X :" + super.getCoordX());
        System.out.println("Координати Y :" + super.getCoordY());
        System.out.println("Ціна :" + super.getPrice());
        System.out.println("Швидкість :" + super.getSpeed());
        System.out.println("Рік випуску :" + super.getYear());
        System.out.println("Кількість пасажирів: " + passengersAmount);
        System.out.println("Порт: " + port);
    }
}
