package JDBC_DAO.Task_2.java.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Sweet implements Comparable<Sweet> {
    private String name;
    private int weight;
    private int calorie;
    private int sugar;

    @Override
    public int compareTo(Sweet o) {
        return Integer.compare(this.calorie, o.getCalorie());
    }
}
