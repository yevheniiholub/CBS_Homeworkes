package Home_work_OOP.Additional_task.Address;

public class Address {
    private String country;
    private String city;
    private String street;
    private int index;
    private int house;
    private int apartment;

    // Конструктор
    public Address(){
    }


    //
    // Геттери
    //

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getIndex() {
        return index;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }

    //
    // Сеттери
    //

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int appartment) {
        this.apartment = appartment;
    }
}
