package Thread_and_Runnable.Additional_task;

/*
    Задание
    Создать 2 произвольных класса с полями и методами.
    Необходимо синхронизировать методы этих классов между собой, т.е. чтобы выводило на экран значения
    друг за другом (1 класс, 2 класс, 1, 2 и т.д.).
 */

class ParkingPlace {
    int placeNumber;
    boolean busy;

    public ParkingPlace(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
}

class Parking {
    ParkingPlace[] parkingPlaces;

    public Parking() {
        parkingPlaces = new ParkingPlace[4];
        for (int i = 0; i < 4; i++) {
            parkingPlaces[i] = new ParkingPlace(i);
        }
    }

    public synchronized ParkingPlace giveParkingPlace() {
        for (ParkingPlace place : parkingPlaces) {
            if (!place.isBusy()) {
                place.setBusy(true);
                return place;
            }
        }
        return null;
    }
}

class Car implements Runnable {
    String name;
    Parking parking;
    ParkingPlace takenPlace;

    public Car(String name, Parking parking) {
        this.name = name;
        this.parking = parking;
    }

    @Override
    public void run() {
        takenPlace = parking.giveParkingPlace();
    }

    public void getParkingInfo(){
        if (takenPlace != null){
            System.out.println("Car " + name + " is parked on " + takenPlace.getPlaceNumber() + " place");
        }
        else {
            System.out.println("For car " + name + " not found free parking place");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Car firstCar = new Car("Lamborghini", parking);
        Car secondCar = new Car("Lada", parking);
        Car thirdCar = new Car("BMW", parking);
        Car fourthCar = new Car("Audi", parking);

        Thread car1Thread = new Thread(firstCar);
        Thread car2Thread = new Thread(secondCar);
        Thread car3Thread = new Thread(thirdCar);
        Thread car4Thread = new Thread(fourthCar);

        car1Thread.start();
        car2Thread.start();
        car3Thread.start();
        car4Thread.start();

        firstCar.getParkingInfo();
        secondCar.getParkingInfo();
        thirdCar.getParkingInfo();
        fourthCar.getParkingInfo();
    }
}
