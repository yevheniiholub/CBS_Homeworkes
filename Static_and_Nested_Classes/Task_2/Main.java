package Static_and_Nested_Classes.Task_2;

/*
        Задание 2
        Создайте проект, используя IntelliJ IDEA.
        Требуется:
        Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
        также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
 */

public class Main {
    public static void main(String[] args) {

        Vehicle.Door vehicleDoor = new Vehicle().new Door();
        Vehicle.Wheel vehicleWheel = new Vehicle().new Wheel();

        vehicleDoor.print();
        vehicleWheel.print();

        /*
            out:
            Door print
            Wheel print
         */
    }
}
