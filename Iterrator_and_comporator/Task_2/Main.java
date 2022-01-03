package Iterrator_and_comporator.Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Задание 2
Вывод на экран элементов List:
Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ListIterator<String> iterator = list.listIterator();

        for (int i = 0; i < 10; i++){
            iterator.add("String " + i);
        }
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
