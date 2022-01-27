package Lambda_expressions.Task_2;

/*
    Задание 2
    Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элемента списка.
    Мы используем метод map() для возведения в квадрат каждого элемента, а потом применяем метод reduce() для
    свертки всех элементов в одно число.
 */

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new Random().ints(0, 50).limit(10).map(x -> x * x).
                reduce(Integer::sum).stream().boxed().toList();
        System.out.println(intList);

    }
}
