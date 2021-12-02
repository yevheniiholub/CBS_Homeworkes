package Class_Object.Task_3;

/*
    Задание 2
    Создать классы:
    1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
    2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
    Добавить методы доступа. Конструктор.
 */

public class Device {
    private String manufacturer;
    private String serialNumber;
    private float  price;

    public Device(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        return "Device :"
                + "manufacturer =" + manufacturer
                + ", price=" + price
                + ", serialNumber=" + serialNumber;
    }
}
