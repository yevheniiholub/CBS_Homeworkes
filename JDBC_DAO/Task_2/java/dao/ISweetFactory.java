package JDBC_DAO.Task_2.java.dao;

public interface ISweetFactory {
    SweetDao getCandyDao();
    SweetDao getCookieDao();
    SweetDao getSweetDao();
}
