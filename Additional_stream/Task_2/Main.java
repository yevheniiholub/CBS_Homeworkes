package Additional_stream.Task_2;

/*
    2. Дан массив чисел.
    ТОЛЬКО через стрим, найти сумму ПЕРВЫХ N цифр (случайное число, не более размера массива).
 */

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int result = IntStream.range(0,50).
                limit(new Random().ints(0,50).limit(1).sum()).
                reduce(Integer::sum).getAsInt();
        System.out.println(result);
    }
}
