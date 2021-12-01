package Anonymous_classes_and_Enums.Additional_task;
/*
    Задание
    Создайте проект, используя IntelliJ IDEA.
    Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
    целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
    строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
    строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.ford_mustang;
        System.out.println(vehicles);

        vehicles = Vehicles.toyota_supra;
        System.out.println(vehicles);

        vehicles = Vehicles.zhyguli;
        System.out.println(vehicles);

        /*
            out:
            ford_mustang; color: black; price: 20000.0
            toyota_supra; color: white; price: 50000.0
            zhyguli; color: red; price: 1000.0
         */
    }
}
