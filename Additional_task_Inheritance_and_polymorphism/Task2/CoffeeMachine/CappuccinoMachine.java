package Additional_task_Inheritance_and_polymorphism.Task2.CoffeeMachine;

/*
 *  Один із видів кавомашин, капучіно машина
 */
public class CappuccinoMachine implements CoffeeMachine{
    private final double LEVEL_TO_DISTANCE = 0.75d;     // Константа для конвертації дистанції між жорновами
    private double distanceBetweenMillstones;           // Локальна змінна дистанції між жорновами

    // Конструктор
    public CappuccinoMachine() {
    }

    // Реалізація методу інтерфейсу по налаштуванню помолу
    // Для імітації роботи я створив додаткову конвертацію, по принципу що для різних кавоварок може бути різна
    // інтерпритація рівня помолу, і тому отриманий рівень множиться на якийсь внутрішній коефіцієнт кавоварки
    @Override
    public void adjustCoffeeGrind(int grindingLevel) {
        distanceBetweenMillstones = grindingLevel * LEVEL_TO_DISTANCE;
    }

    // Реалізація методу приготування еспресо
    @Override
    public void makeEspresso() {
        System.out.println("Espresso is ready!");
    }

    // Метод взбивання молока для капучіно
    private void steamMilk(){
        System.out.println("Milk steamed for cappuccino!");
    }

    // Приготування капучіно за допомогою методу інтерфейсу і власного прихованого методу
    public void makeCappuccino(){
        makeEspresso();
        steamMilk();
        System.out.println("Cappuccino is ready!");
    }

    /*
     *  Геттери і сеттери
     */

    public double getDistanceBetweenMillstones() {
        return distanceBetweenMillstones;
    }

    public void setDistanceBetweenMillstones(double distanceBetweenMillstones) {
        this.distanceBetweenMillstones = distanceBetweenMillstones;
    }
}
