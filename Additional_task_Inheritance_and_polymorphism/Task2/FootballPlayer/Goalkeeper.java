package Additional_task_Inheritance_and_polymorphism.Task2.FootballPlayer;

/*
 *  Клас голкіпера, реазізований від інтерфейсу футболіста
 */
public class Goalkeeper implements FootballPlayer{
    private int playerNumber;           // Номер гравця
    private String playerName;          // Ім'я гравця
    private boolean withBall;           // Чи знаходиться данний гравець з м'ячем

    // Конструктор
    public Goalkeeper() {
    }

    // Дати пас іншому гравцю
    @Override
    public void givePass(FootballPlayer destinationPlayer) {
        destinationPlayer.getPass();
        withBall = false;
    }

    // Прийняти пас
    @Override
    public void getPass() {
        withBall = true;
    }

    // Вибити м'яч
    @Override
    public void kickOff() {
        System.out.println("Ball was kicked off!");
        withBall = false;
    }

    /*
     *  Геттери і сеттери
     */

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isWithBall() {
        return withBall;
    }

    public void setWithBall(boolean withBall) {
        this.withBall = withBall;
    }
}
