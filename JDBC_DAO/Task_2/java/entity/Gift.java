package JDBC_DAO.Task_2.java.entity;

import JDBC_DAO.Additional_task.java.logic.SweetReader;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@ToString
public class Gift {
    private List<Sweet> sweets;


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
