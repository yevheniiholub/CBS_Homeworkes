package Home_work_Classes_and_Objects.Additional_task;

public class MyArea {
    private static final double PI = Math.PI;               // Статична константа, прирівняна до статичної константи
                                                            // классу Math
    // Розрахунок площі кола по формулі S = π × r2
    public static double areaOfCircle(double radiusArg){
        return PI * Math.pow(radiusArg, 2);
    }
}
