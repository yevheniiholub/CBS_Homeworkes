package JDBC_DAO.Additional_task.java.entity;

import JDBC_DAO.Additional_task.java.logic.SweetReader;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@ToString
public class Gift{
    private List<Sweet> sweets;

    /**
     *  Ініціалізація sweets, отриманими із файлу даними.
     *  Через статичний метод зчитування з файлу, отримуємо список данних для ініціалізації
     *  Структура файлу
     *  "Тип солодощів (Цукерка, або печево), "вага", "калорії", "цукор"
     *  Два додаткових поля залежать від першого поля
     *  Цукерка: "чи це льодяник", "чи це шоколадна цукерка"
     *  Печиво: "Вміст муки", "Назва начинки"
     *
     *  В методі SweetReader.readSweets(), зчитується файл і розбивається по \n
     *  Отриманий список тут розбивається по ", ". І кожне поле вписується у відповідну
     *  позицію параметру конструктора
     */
    public void initSweets() {
        List<String> sweetsInit = SweetReader.readSweets();
        String[] oneSweetInfo;

        sweets = new ArrayList<>();
        for (String sweet : sweetsInit) {
            if (sweet != null) {
                oneSweetInfo = sweet.split(", ");
                if (oneSweetInfo[0].equals("Candy")) {
                    sweets.add(new Candy(oneSweetInfo[1], Integer.parseInt(oneSweetInfo[2]),
                                    Integer.parseInt(oneSweetInfo[3]), Integer.parseInt(oneSweetInfo[4]),
                                    Boolean.parseBoolean(oneSweetInfo[5]), Boolean.parseBoolean(oneSweetInfo[6])));
                } else if (oneSweetInfo[0].equals("Cookie")) {
                    sweets.add(new Cookie(oneSweetInfo[1], Integer.parseInt(oneSweetInfo[2]),
                            Integer.parseInt(oneSweetInfo[3]), Integer.parseInt(oneSweetInfo[4]),
                            Integer.parseInt(oneSweetInfo[5]), oneSweetInfo[6]));
                } else {
                    sweets.add(null);
                }
            }
        }
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
