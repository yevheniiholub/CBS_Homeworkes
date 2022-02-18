package JDBC_and_Hibernate.JDBC.Task2;

import java.sql.*;

public class DBQueries {
    public static void insertQuery(){
        final String PREPARED_ST = "insert simpleTable (name, age, phone) values (?, ?, ?)";
        PreparedStatement statement = null;

        try (Connection connection = ConnectionHandler.getConnection()) {
            statement = connection.prepareStatement(PREPARED_ST);
            statement.setString(1, "Yevhenii");
            statement.setInt(2, 25);
            statement.setString(3, "088800546");
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void selectQuery(){
        Statement statement = null;

        try (Connection connection = ConnectionHandler.getConnection()) {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from simpleTable");

            while (resultSet.next()){
                System.out.println("Name :" + resultSet.getString("name"));
                System.out.println("Age :" + resultSet.getString("age"));
                System.out.println("Phone :" + resultSet.getString("phone") + "\n");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void updateQuery(){
        Statement statement = null;

        try (Connection connection = ConnectionHandler.getConnection()) {
            statement = connection.createStatement();
            statement.executeUpdate("update simpleTable set name = 'Gena' where id = 1");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void deleteQuery(){
        Statement statement = null;

        try (Connection connection = ConnectionHandler.getConnection()) {
            statement = connection.createStatement();
            statement.executeUpdate("delete from simpleTable where name = 'Yevhenii'");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
