package JDBC_and_Hibernate.JDBC.Task3;

/*
Задание 2
Используя дополнительное задания все вопросы записать в текстовом файле с новой строки каждый и
используя потоки ввода-вывода считать с файла все запросы и выполнить.
 */

public class Main {

    public static void main(String[] args) {
        DriverLoader.LoadDriver();
        QueryHandler.completeQuery();
    }
}
