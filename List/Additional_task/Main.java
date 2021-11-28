package List.Additional_task;

/*
    Задание
    Используя Intelij IDEA создать проект, пакет.
    Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
    школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Вчитель Хімії");
        teachers.add("Вчитель Фізики");
        teachers.add("Вчитель Геометрії");
        teachers.add("Вчитель Української мови");
        teachers.add("Вчитель Алгебри");
        teachers.add("Вчитель Зарубіжної літератури");
        teachers.add("Вчитель Інформатики");

        System.out.println("Найгірший вчитель " + teachers.get(0));
        System.out.println("Найкращий вчитель " + teachers.get(teachers.size() - 1));
    }
}
