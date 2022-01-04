package Annotations.Task_2;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CaclulatorArgs {
    int firstArg();
    int secondArg();
}
