package Iterrator_and_comporator.Task_additional;

/*
Задание 2
В папке с примерами, ex_004_comparable.
Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов
равна, то ищем по цене) -> цене - > моделе -> цвету машины
 */

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        int tempPrice;
        int tempModel;
        if (temp == 0) {
            tempPrice =  this.price - ((Car)o).price;
            if (tempPrice == 0){
                tempModel = this.model.compareTo(model);
                if (tempModel == 0) {
                    return (this.color.compareTo(color));
                }
                else {
                    return tempModel;
                }
            } else {
                return tempPrice;
            }
        } else {
            return temp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}