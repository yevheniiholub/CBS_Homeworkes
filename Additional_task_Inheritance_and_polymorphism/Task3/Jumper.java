package Additional_task_Inheritance_and_polymorphism.Task3;

/*
 * Класс пригун
 */
public class Jumper implements Athlete{
    private int stamina;                // Енергія
    private int maxAltitude;            // Максимальна висота стрибка на данний момент
    private int desiredAltitude;        // Рекорд, який хоче побити даний атлет

    // Конструктор
    public Jumper() {
    }

    // Відпочинок
    @Override
    public void rest() {
        stamina += 30;
    }

    // Тренування
    @Override
    public void workout() {
        stamina =- 10;
        maxAltitude = 2;
    }

    // Спроба побити рекорд
    public void setNewRecord(){
        // Якщо стрибок більший за рекорд, то рекорд побито
        if (desiredAltitude < maxAltitude){
            System.out.println("Congratulation, you set new world record!");
            desiredAltitude = maxAltitude;
        }
        else{
            System.out.println("Sorry, it's not a world record!");
        }
        stamina -= 10;
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

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getDesiredAltitude() {
        return desiredAltitude;
    }

    public void setDesiredAltitude(int desiredAltitude) {
        this.desiredAltitude = desiredAltitude;
    }
}
