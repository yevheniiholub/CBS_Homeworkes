package Annotations.Additional_task;

import java.lang.reflect.Method;

public class AnnotationMath {
    @Math(num1 = 100, num2 = 200)
    public void mathSum() {
        try {
            Method method =  getClass().getMethod("mathSum");
            Math m = method.getAnnotation(Math.class);
            System.out.println(m.num1() + m.num2());
        }
        catch (NoSuchMethodException | SecurityException e) {
            System.out.println(e.getMessage());
        }
    }

}
