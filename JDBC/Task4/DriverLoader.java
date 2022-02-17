package JDBC_and_Hibernate.JDBC.Task4;

public class DriverLoader {
    public static void LoadDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
