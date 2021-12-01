package Anonymous_classes_and_Enums.Additional_task;

public enum Vehicles {
    ford_mustang("black",20000), toyota_supra("white", 50000), zhyguli("red", 1000);
    private String color;
    private double price;

    Vehicles(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + "; color: " + getColor() + "; price: " + price;
    }
}
