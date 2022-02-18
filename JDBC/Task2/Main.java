package JDBC_and_Hibernate.JDBC.Task2;

/*
    Задание
    Создать базу данных в Workbench и подключить к IntelijIdea и создать тестовую таблицу. Заполнить ее
    данными с помощью запросов MySQL в IntelijIdea. Используя JDBC написать пример выполнения всех
    запросов.
 */

public class Main {

    public static void main(String[] args) {
         DriverLoader.LoadDriver();

         DBQueries.insertQuery();
         DBQueries.selectQuery();
         DBQueries.updateQuery();
         DBQueries.deleteQuery();
    }
}
