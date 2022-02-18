package JDBC_and_Hibernate.JDBC.Task4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompleteQueries {
    public static void printQueryResult(String query, String firstCol, String secondCol) {
        try (Connection connection = ConnectionHandler.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(firstCol + ": " + resultSet.getString(firstCol));
                System.out.println(secondCol + ": " + resultSet.getString(secondCol));
            }
            System.out.println();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
