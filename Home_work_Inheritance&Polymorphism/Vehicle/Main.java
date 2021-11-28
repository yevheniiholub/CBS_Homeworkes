package HW2_3.Vehicle;

/*
    Задание 3
    Используя IntelliJ IDEA, создайте проект.
    Требуется:
    Создать класс Vehicle.
    В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
    выпуска).
    Создайте 3 производных класса Plane, Саг и Ship.
    Для класса Plane должна быть определена высота и количество пассажиров.
    Для класса Ship – количество пассажиров и порт приписки.
    Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
 */

public class Main {
    public static void printVehicleInfo(Vehicle anyVehicle){
        anyVehicle.printAllVehicleInfo();
        System.out.println();
    }

    public static void main(String[] args) {
        Car userCar = new Car(120.0d, 150.0d, 200000, 200, 2016, "Mustang");
        Plane userPlane = new Plane(162.0d, 198.0d, 6000000, 600, 2007,
                1500,200);
        Ship userShip = new Ship(54.0d, 154.0d, 450000, 120, 2002, 207,
                "Kyiv port");

        printVehicleInfo(userCar);
        printVehicleInfo(userPlane);
        printVehicleInfo(userShip);

        /*
            Результат:

            Машина
            Координати X :120.0
            Координати Y :150.0
            Ціна :200000
            Швидкість :200
            Рік випуску :2016
            Модель машини :Mustang

            Літак
            Координати X :162.0
            Координати Y :198.0
            Ціна :6000000
            Швидкість :600
            Рік випуску :2007
            Висота:1500.0
            Кількість пасажирів: 200

            Корабель
            Координати X :54.0
            Координати Y :154.0
            Ціна :450000
            Швидкість :120
            Рік випуску :2002
            Кількість пасажирів: 207
            Порт: Kyiv port
         */
    }
}
