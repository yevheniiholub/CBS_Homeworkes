package Additional_task_Inheritance_and_polymorphism.Task1;

/*
 * Класс форд
 */
public class Ford {
    private String modelName;       // Назва модельного ряду
    private String canNumbers;      // Номера машини
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

    public String getCanNumbers() {
        return canNumbers;
    }

    public void setCanNumbers(String canNumbers) {
        this.canNumbers = canNumbers;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
}
