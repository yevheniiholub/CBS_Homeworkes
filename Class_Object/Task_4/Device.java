package Class_Object.Task_4;

/*
    Задание 2
    Создать классы:
    1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
    2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
    Добавить методы доступа. Конструктор.
 */

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }
}
