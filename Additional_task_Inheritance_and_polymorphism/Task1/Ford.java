package Additional_task_Inheritance_and_polymorphism.Task1;

/*
 * Класс форд
 */
public class Ford {
    private String modelName;       // Назва модельного ряду
    private String carNumbers;      // Номера машини
    private int yearOfCreation;     // Рік виробництва

    // Конструктор
    public Ford() {
    }

    /*
     * Геттери і сеттери
     */

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCarNumbers() {
        return carNumbers;
    }

    public void setCarNumbers(String carNumbers) {
        this.carNumbers = carNumbers;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
}
