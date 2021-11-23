package Additional_task_Inheritance_and_polymorphism.Task3;

/*
 * Класс бігун
 */
public class Runner implements Athlete{
    private int stamina;                        // Енергія
    private int maxRunningDistance;             // Дистанція яку може пробігти бігун
    private final int MARATHON_DISTANCE = 40;   // Дистанція марафону
    private final int MARATHON_STAMINA = 100;   // Кількість енергії для подолання марафону

    // Конструктор
    public Runner() {
    }

    // Відпочинок
    @Override
    public void rest() {
        stamina += 20;
    }

    // Тренування
    @Override
    public void workout() {
        stamina -= 20;
        maxRunningDistance += 1;
    }

    // Біг марафону
    public void runMarathon(){
        // Якщо енергії і дистанції достатньо, то марафон подолано
        if (maxRunningDistance >= MARATHON_DISTANCE && stamina >= MARATHON_STAMINA) {
            stamina -= MARATHON_STAMINA;
            System.out.println("Marathon is complete");
        }
        else{
            System.out.println("You not ready for marathon");
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

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public void setMaxRunningDistance(int maxRunningDistance) {
        this.maxRunningDistance = maxRunningDistance;
    }
}
