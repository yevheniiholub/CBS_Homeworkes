package JDBC_and_Hibernate.JDBC.Task3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class QueryHandler {
    public static void selectQuery(String query){
        Statement statement = null;

        try (Connection connection = JDBC_and_Hibernate.JDBC.Task2.ConnectionHandler.getConnection()) {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("Name :" + resultSet.getString("name"));
                System.out.println("Age :" + resultSet.getString("age"));
                System.out.println("Phone :" + resultSet.getString("phone") + "\n");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void completeQuery() {
        List<String> queries = FileHandler.getQueries();
        Statement statement = null;

        try (Connection connection = ConnectionHandler.getConnection()){
            statement = connection.createStatement();
            for (String query : queries) {
                if (query.contains("select")) {
                    selectQuery(query);
                }
                else {
                    statement.executeUpdate(query);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
