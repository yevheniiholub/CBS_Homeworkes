package JDBC_DAO.Task_2.java.dao.impl;

import JDBC_DAO.Task_2.java.entity.Cookie;
import JDBC_DAO.Task_2.java.entity.Gift;

public class CookieDaoImpl extends SweetDaoImpl {
    @Override
    public void add(String[] sweetInfo) {
        Gift gift = Gift.getGift();
        if (sweetInfo != null) {
            gift.getSweets().add(new Cookie(sweetInfo[1], Integer.parseInt(sweetInfo[2]),
                    Integer.parseInt(sweetInfo[3]), Integer.parseInt(sweetInfo[4]),
                    Integer.parseInt(sweetInfo[5]), sweetInfo[6]));
        }
    }
}
