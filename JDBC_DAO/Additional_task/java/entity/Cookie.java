package JDBC_DAO.Additional_task.java.entity;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Cookie extends Sweet{
    private int flourQuantity;
    private String filling;

    public Cookie(String name, int weight, int calorie, int sugar, int flourQuantity, String filling) {
        super(name, weight, calorie, sugar);
        this.flourQuantity = flourQuantity;
        this.filling = filling;
    }
}
