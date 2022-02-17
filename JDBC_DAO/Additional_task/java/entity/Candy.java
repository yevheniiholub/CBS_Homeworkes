package JDBC_DAO.Additional_task.java.entity;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Candy extends Sweet{
    private boolean lollipop;
    private boolean chocolate;

    public Candy(String name, int weight, int calorie, int sugar, boolean lollipop, boolean chocolate) {
        super(name, weight, calorie, sugar);
        this.lollipop = lollipop;
        this.chocolate = chocolate;
    }
}
