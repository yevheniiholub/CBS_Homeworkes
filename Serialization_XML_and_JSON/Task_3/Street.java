package Serialization_XML_and_JSON.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private String streetName;
    private List<Integer> streetNumbers;

    public Street() {
        streetNumbers = new ArrayList<>();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public List<Integer> getStreetNumbers() {
        return streetNumbers;
    }

    public void setStreetNumbers(List<Integer> streetNumbers) {
        this.streetNumbers = streetNumbers;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetName='" + streetName + '\'' +
                ", streetNumbers=" + streetNumbers +
                '}';
    }
}
