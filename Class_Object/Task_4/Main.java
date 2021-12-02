package Class_Object.Task_4;

/*
    Задание 4
    Смотреть задание 2.
    Переопределить методы equals & hashCode в каждом классе.
    Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные
    методы.
 */

public class Main {

    public static void printHashCodeArray(Device [] devices){
        for (Device device : devices) {
            System.out.println(device.hashCode());
        }
        System.out.println();
    }

    public static void printEqualsResult(Device [] devices){
        System.out.println("devices[0].equals(devices[1] = " + devices[0].equals(devices[1]));
        System.out.println("devices[0].equals(devices[2] = " + devices[0].equals(devices[2]));
        System.out.println("devices[0].equals(devices[3] = " + devices[0].equals(devices[3]));
        System.out.println();
    }

    public static void main(String[] args) {

        /*
             Заповнювання масивів по принципу: 1 логічно дорівнює 2; 1 логічно не дорівнює 3; 1 по ссилці дорівнює 4
         */

        Device [] devices = new Device[]{new Device("Samsung", "1111AAAA", 400),
                new Device("Samsung", "1111AAAA", 400),
                new Device("Somsung", "1111AAAA", 400),
                null};

        EthernetAdapter [] ethernetAdapters = { new EthernetAdapter("111111", 300,"Samsung", "1111AAAA", 400),
                new EthernetAdapter("111111", 300,"Samsung", "1111AAAA", 400),
                new EthernetAdapter("111112", 300,"Samsung", "1111AAAA", 400),
                null};

        Monitor [] monitors = {new Monitor(1280,1920,"Samsung", "1111AAAA", 400),
                new Monitor(1280,1920,"Samsung", "1111AAAA", 400),
                new Monitor(1281,1920,"Samsung", "1111AAAA", 400),
                null};

        devices[3] = devices[0];
        ethernetAdapters[3] = ethernetAdapters[0];
        monitors[3] = monitors[0];

        // Вивід хешкодів для всіх масивів
        System.out.println("Devices hashcodes");
        printHashCodeArray(devices);

        System.out.println("Ethernet hashcodes");
        printHashCodeArray(ethernetAdapters);

        System.out.println("Monitors hashcodes");
        printHashCodeArray(monitors);

        // Вивід equals для всіх масивів
        System.out.println("Devices equals");
        printEqualsResult(devices);

        System.out.println("Ethernet equals");
        printEqualsResult(ethernetAdapters);

        System.out.println("Monitors equals");
        printEqualsResult(monitors);

        /*
            out
            Devices hashcodes
            -1111006919
            -1111006919
            1813501291
            -1111006919

            Ethernet hashcodes
            -538132956
            -538132956
            -538132925
            -538132956

            Monitors hashcodes
            1769278936
            1769278936
            1769278967
            1769278936

            Devices equals
            devices[0].equals(devices[1] = true
            devices[0].equals(devices[2] = false
            devices[0].equals(devices[3] = true

            Ethernet equals
            devices[0].equals(devices[1] = true
            devices[0].equals(devices[2] = false
            devices[0].equals(devices[3] = true

            Monitors equals
            devices[0].equals(devices[1] = true
            devices[0].equals(devices[2] = false
            devices[0].equals(devices[3] = true
         */
    }
}
