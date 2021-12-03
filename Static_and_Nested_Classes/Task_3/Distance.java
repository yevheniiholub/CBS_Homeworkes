package Static_and_Nested_Classes.Task_3;

public class Distance {
    private static final double KILOMETERS_IN_MILE = 1.609d;
    private static final double METERS_IN_KILOMETERS = 1000.0d;
    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public static class Converter {
        public static double convertKilometersToMile(double paramIn){
            return paramIn / KILOMETERS_IN_MILE;
        }
        public static double convertMilesToKilometer(double paramIn){
            return paramIn * KILOMETERS_IN_MILE;
        }
        public static double convertKilometersToMeters(double paramIn){
            return paramIn / METERS_IN_KILOMETERS;
        }
        public static double convertMetersToKilometer(double paramIn){
            return paramIn * METERS_IN_KILOMETERS;
        }
    }
}
