package Static_and_Nested_Classes.Additional_task;

public class Calculator {
    static public double add(double firstArg, double secondArg){
        return firstArg + secondArg;
    }
    static public double sub(double firstArg, double secondArg){
        return firstArg - secondArg;
    }
    static public double mul(double firstArg, double secondArg){
        return firstArg * secondArg;
    }
    static public double div(double firstArg, double secondArg){
        if (secondArg != 0)
            return firstArg / secondArg;
        else
            return 0;
    }
    static public double mod(double firstArg, double secondArg){
        if (secondArg != 0) {
            return firstArg % secondArg;
        } else {
            return 0;
        }
    }
}
