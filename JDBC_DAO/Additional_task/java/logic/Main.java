package JDBC_DAO.Additional_task.java.logic;

import JDBC_DAO.Additional_task.java.entity.Gift;

/*
    Задание
    Написать консольное приложение (одно на выбор) из данного списка.
    https://careers.epam.by/content/dam/epam/by/book_epam_by/JAVA_Methods_Programming_v2.march201
    5.pdf на странице 126, не используя доступа к базе данных и DAO

    2. Новогодний подарок. Определить иерархию конфет и прочих сладостей.
    Создать несколько объектов-конфет. Собрать детский подарок с определением его веса. Провести сортировку конфет
    в подарке на основе одного из параметров. Найти конфету в подарке, соответствующую заданному диапазону
    содержания сахара.
*/
public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.initSweets();
        gift.sortByCalories();
        System.out.println(gift.getSugarRange(50, 250));
        System.out.println(gift.calculateSweetsWeight());
    }
}
