package Additional_task_Inheritance_and_polymorphism.Task2.FootballPlayer;

/*
 * Інтерфейс футболіста
 */
public interface FootballPlayer {
    void givePass(FootballPlayer destinationPlayer);        // Дати пас гравцю
    void getPass();                                         // Прийняти пас
    void kickOff();                                         // Вибити м'яч
}
