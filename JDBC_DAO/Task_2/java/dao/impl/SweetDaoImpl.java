package JDBC_DAO.Task_2.java.dao.impl;

import JDBC_DAO.Task_2.java.entity.Candy;
import JDBC_DAO.Task_2.java.entity.Cookie;
import JDBC_DAO.Task_2.java.entity.Gift;
import JDBC_DAO.Task_2.java.entity.Sweet;
import JDBC_DAO.Task_2.java.dao.SweetDao;

public class SweetDaoImpl implements SweetDao {
    private Gift gift;

    private Gift getGift() {
        if (gift == null) {
            gift = new Gift();
        }
        return gift;
    }

    public int calculateWeightOfGift(){
        return getGift().calculateSweetsWeight();
    }

    public void sortGift() {
        getGift().sortByCalories();
    }

    @Override
    public void add(String sweetInfo) {
        String[] sweetInfoSplit;
        Gift gift = getGift();
        if (sweetInfo != null) {
            sweetInfoSplit = sweetInfo.split(", ");
            if (sweetInfoSplit[0].equals("Candy")) {
                gift.getSweets().add(new Candy(sweetInfoSplit[1], Integer.parseInt(sweetInfoSplit[2]),
                        Integer.parseInt(sweetInfoSplit[3]), Integer.parseInt(sweetInfoSplit[4]),
                        Boolean.parseBoolean(sweetInfoSplit[5]), Boolean.parseBoolean(sweetInfoSplit[6])));
            } else if (sweetInfoSplit[0].equals("Cookie")) {
                gift.getSweets().add(new Cookie(sweetInfoSplit[1], Integer.parseInt(sweetInfoSplit[2]),
                        Integer.parseInt(sweetInfoSplit[3]), Integer.parseInt(sweetInfoSplit[4]),
                        Integer.parseInt(sweetInfoSplit[5]), sweetInfoSplit[6]));
            } else {
                gift.getSweets().add(null);
            }
        }
    }

        @Override
        public Sweet update (Sweet sweet){
            return null;
        }

        @Override
        public boolean delete (Sweet user){
            return false;
        }

        @Override
        public Sweet get ( int minSugar, int maxSugar){
            Gift gift = getGift();
            for (Sweet sweet : gift.getSweets()) {
                if (sweet.getSugar() < maxSugar && sweet.getSugar() > minSugar) {
                    return sweet;
                }
            }
            return null;
        }
    }
