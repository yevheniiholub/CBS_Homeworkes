package Additional_task_Inheritance_and_polymorphism.Task3;

/*
 * Класс боксер
 */
public class Boxer implements Athlete{
    private int stamina;            // Енергія
    private int condition;          // Готовність до бою

    // Конструктор
    public Boxer() {
    }

    // Відпочинок
    @Override
    public void rest() {
        stamina += 20;
    }

    // Тренування
    @Override
    public void workout() {
        stamina -= 35;
        condition += 20;
    }

    // Бій
    public void fight(int opponentCondition){
        // Якщо готовність до бою більша ніж у опонента, то виграш
        if (opponentCondition <= condition){
            System.out.println("You won the fight");
        }
        else{
            System.out.println("You lose the fight");
        }
    }

    /*
     * Геттери і сеттери
     */

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
