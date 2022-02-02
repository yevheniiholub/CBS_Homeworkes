package Additional_stream.Task_1;

/*
    1. Дан массив чисел.
    ТОЛЬКО через стрим найти способ найти сумму их всех.
    Способов минимум 2, но достаточно 1.
 */

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] intArray = {23, 21, 54, 65, 32, 12};

        // Спосіб 1
        int result = IntStream.of(intArray).sum();
        System.out.println(result);

        // Спосіб 2
        int result2 = IntStream.of(intArray).reduce(Integer::sum).stream().sum();
        System.out.println(result2);
    }
}
