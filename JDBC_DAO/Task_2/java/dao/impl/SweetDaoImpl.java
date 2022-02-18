package JDBC_DAO.Task_2.java.dao.impl;

import JDBC_DAO.Task_2.java.entity.Candy;
import JDBC_DAO.Task_2.java.entity.Cookie;
import JDBC_DAO.Task_2.java.entity.Gift;
import JDBC_DAO.Task_2.java.entity.Sweet;
import JDBC_DAO.Task_2.java.dao.SweetDao;

import java.util.ArrayList;
import java.util.List;

public class SweetDaoImpl implements SweetDao {
    @Override
    public void add(String[] sweetInfo) {
        Gift gift = Gift.getGift();
        if (sweetInfo != null) {
            gift.getSweets().add(new Sweet("Unknown", 0, 0, 0));
        }
    }

    @Override
    public Sweet update(Sweet sweet) {
        return null;
    }

    @Override
    public boolean delete(Sweet user) {
        return false;
    }

    @Override
    public Sweet get(int minSugar, int maxSugar) {
        Gift gift = Gift.getGift();
        for (Sweet sweet : gift.getSweets()) {
            if (sweet.getSugar() < maxSugar && sweet.getSugar() > minSugar) {
                return sweet;
            }
        }
        return null;
    }
}
