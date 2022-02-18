package JDBC_DAO.Task_2.java.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ToString
public class Gift {
    private static Gift gift;
    private List<Sweet> sweets;

    private Gift () {
        sweets = new ArrayList<>();
    }

    public static Gift getGift() {
        if (gift == null) {
            gift = new Gift();
        }
        return gift;
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public int calculateSweetsWeight() {
        int result;

        result = 0;
        for (Sweet sweet : sweets) {
            result += sweet.getWeight();
        }
        return result;
    }

    public void sortByCalories() {
        Collections.sort(sweets);
    }

    public Sweet getSugarRange(int minSugar, int maxSugar) {
        for (Sweet sweet : sweets) {
            if (sweet.getSugar() < maxSugar && sweet.getSugar() > minSugar) {
                return sweet;
            }
        }
        return null;
    }
}
