package Abstraction.Task3;

/*
    Задание 3
    Используя IntelliJ IDEA, создайте проект.Требуется:
    Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
    void pause() / void stop() и void record() / void pause() / void stop() соответственно.
    Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
    Написать программу, которая выполняет проигрывание и запись.
 */

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.record();
        player.pause();
        player.stop();
        /*
            out:
            Method play is called
            Method record is called
            Method pause is called
            Method stop is called
         */
    }
}
