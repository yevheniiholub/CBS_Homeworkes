package JDBC_DAO.Task_2.java.dao.impl;

import JDBC_DAO.Task_2.java.entity.Candy;
import JDBC_DAO.Task_2.java.entity.Gift;

public class CandyDaoImpl extends SweetDaoImpl {
    @Override
    public void add(String[] sweetInfo) {
        Gift gift = Gift.getGift();
        if (sweetInfo != null) {
            gift.getSweets().add(new Candy(sweetInfo[1], Integer.parseInt(sweetInfo[2]),
                    Integer.parseInt(sweetInfo[3]), Integer.parseInt(sweetInfo[4]),
                    Boolean.parseBoolean(sweetInfo[5]), Boolean.parseBoolean(sweetInfo[6])));
        }
    }
}
