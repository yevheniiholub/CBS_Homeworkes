package List.Task4;

/*
    Задание 4
    Используя Intelij IDEA создать проект, пакет.
    Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
    значения на 1;
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integersArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integersArray.add(150 + i);
        }

        System.out.println("Before");
        for (Integer integer : integersArray) {
            System.out.println(integer);
        }
        System.out.println();

        ListIterator<Integer> iterator = integersArray.listIterator();

        while (iterator.hasNext()) {
            integersArray.set(iterator.nextIndex(), integersArray.get(iterator.nextIndex()) + 1);
            iterator.next();
        }

        System.out.println("After");
        for (Integer integer : integersArray) {
            System.out.println(integer);
        }

    }
}
