package Static_and_Nested_Classes.Task_3;

/*
    Создайте проект, используя IntelliJ IDEA.
    Требуется:
    Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
    статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
    измерения (к примеру, из метров в километры, из километров в мили, и так далее).
 */

public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(50.0d);

        System.out.println(Distance.Converter.convertKilometersToMile(distance.getDistance()));
        System.out.println(Distance.Converter.convertMilesToKilometer(distance.getDistance()));
        System.out.println(Distance.Converter.convertKilometersToMeters(distance.getDistance()));
        System.out.println(Distance.Converter.convertMetersToKilometer(distance.getDistance()));

        /*
            out:
            31.07520198881293
            80.45
            0.05
            50000.0
         */
    }
}
