package Home_work_OOP.Task2.Rectangle;

public class Rectangle {
    private double sideOne;
    private double sideTwo;

    // Конструктор з значеннями двох сторін
    public Rectangle(double newSideOne, double newSideTwo){
        this.sideOne = newSideOne;
        this.sideTwo = newSideTwo;
    }

    // Розразунок площі прямокутника
    public double areaCalculator (){
        return this.sideOne * this.sideTwo;
    }

    // Розрахунок периметру прямокутника
    public double perimeterCalculator(){
        return (this.sideOne + this.sideTwo) * 2;
    }
}
