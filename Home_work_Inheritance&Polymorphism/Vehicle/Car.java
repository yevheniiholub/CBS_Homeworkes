package HW2_3.Vehicle;

public class Car extends Vehicle{
    private String model;

    public Car(double coordX, double coordY, int price, int speed, int year, String model) {
        super(coordX, coordY, price, speed, year);
        this.model = model;
    }

    @Override
    public void printAllVehicleInfo() {
        System.out.println("Машина");
        System.out.println("Координати X :" + super.getCoordX());
        System.out.println("Координати Y :" + super.getCoordY());
        System.out.println("Ціна :" + super.getPrice());
        System.out.println("Швидкість :" + super.getSpeed());
        System.out.println("Рік випуску :" + super.getYear());
        System.out.println("Модель машини :" + model);
    }
}
