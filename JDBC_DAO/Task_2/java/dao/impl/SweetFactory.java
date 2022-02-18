package JDBC_DAO.Task_2.java.dao.impl;

import JDBC_DAO.Task_2.java.dao.SweetDao;
import JDBC_DAO.Task_2.java.dao.ISweetFactory;


public class SweetFactory implements ISweetFactory {
    private static SweetFactory factory;

    private SweetFactory() {

    }

    public static SweetFactory getInstance() {
        if (factory == null) {
            factory = new SweetFactory();
        }
        return factory;
    }

    @Override
    public SweetDao getCandyDao() {
        return new CandyDaoImpl();
    }

    @Override
    public SweetDao getCookieDao() {
        return new CookieDaoImpl();
    }

    @Override
    public SweetDao getSweetDao() {
        return new SweetDaoImpl();
    }
}
