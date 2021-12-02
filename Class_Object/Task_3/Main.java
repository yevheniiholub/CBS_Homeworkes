package Class_Object.Task_3;

/*
    Задание 3
    Смотреть задание 2.
    В обоих классах переопределить метод toString, что бы вывод был следующим:
    Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
 */

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", "AB1234567CD", 120);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("1111", 300, "Samsung", "AB1234567CD", 120);
        Monitor monitor = new Monitor(1280, 1024, "Samsung", "AB1234567CD", 120);

        System.out.println(device);
        System.out.println(ethernetAdapter);
        System.out.println(monitor);

        /*
            out:
            Device :manufacturer =Samsung, price=120.0, serialNumber=AB1234567CD
            EthernetAdapter :manufacturer =Samsung, price=120.0, serialNumber=AB1234567CD, mac=1111, speed=300
            Monitor :manufacturer =Samsung, price=120.0, serialNumber=AB1234567CD, resolutionX=1280, resolutionY=1024
         */
    }
}
