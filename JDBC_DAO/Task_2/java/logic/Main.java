package JDBC_DAO.Task_2.java.logic;

import JDBC_DAO.Additional_task.java.logic.SweetReader;
import JDBC_DAO.Task_2.java.dao.SweetDao;
import JDBC_DAO.Task_2.java.dao.impl.SweetDaoImpl;
import JDBC_DAO.Task_2.java.dao.impl.SweetFactory;
import JDBC_DAO.Task_2.java.entity.Gift;

import java.util.List;
import java.util.function.Consumer;

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
    private static SweetDaoImpl sweetDao = new SweetDaoImpl();

    public static void main(String[] args) {
        List<String> sweetsInit = SweetReader.readSweets();
        SweetFactory factory = SweetFactory.getInstance();
        SweetDao candyDao = factory.getCandyDao();
        SweetDao cookieDao = factory.getCookieDao();
        SweetDao sweetDao = factory.getSweetDao();
        Consumer<String[]> sweetInitHandler = strings -> {
            if (strings[0].equals("Candy")) {
                candyDao.add(strings);
            } else if (strings[0].equals("Cookie")) {
                cookieDao.add(strings);
            } else {
                sweetDao.add(strings);
            }
        };

        sweetsInit.stream().map(x -> x.split(", ")).forEach(sweetInitHandler);

        Gift.getGift().sortByCalories();
        System.out.println(Gift.getGift().calculateSweetsWeight());
        System.out.println(sweetDao.get(50, 250));
    }
}
