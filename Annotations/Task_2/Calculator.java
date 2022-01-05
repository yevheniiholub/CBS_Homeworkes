package Annotations.Task_2;

@CaclulatorArgs(firstArg = 10, secondArg = 5)
public class Calculator {

    /**
     *
     * @return sum of annotation parameters
     */
    public int add() {
        CaclulatorArgs a = getClass().getAnnotation(CaclulatorArgs.class);

        return a.firstArg() + a.secondArg();
    }

    /**
     *
     * @return difference of annotation parameters
     */
    public int sub() {
        CaclulatorArgs a = getClass().getAnnotation(CaclulatorArgs.class);

        return a.firstArg() - a.secondArg();
    }

    /**
     *
     * @return result of multiplication of annotation parameters
     */
    public int mul() {
        CaclulatorArgs a = getClass().getAnnotation(CaclulatorArgs.class);

        return a.firstArg() * a.secondArg();
    }

    /**
     *
     * @return result of division of annotation parameters
     */
    public int div() {
        CaclulatorArgs a = getClass().getAnnotation(CaclulatorArgs.class);

        if (a.secondArg() != 0) {
            return a.firstArg() / a.secondArg();
        }
        return 0;
    }

    /**
     * Constructor without parameters
     */
    public Calculator() {
    }
}
