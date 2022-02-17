package JDBC_DAO.Task_2.java.dao;

import JDBC_DAO.Task_2.java.entity.Sweet;

public interface SweetDao {
    void add(String sweetInfo);

    Sweet update(Sweet sweet);

    boolean delete(Sweet user);

    Sweet get(int minSugar, int maxSugar);
}
