package Abstraction.Task3;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Method play is called");
    }

    @Override
    public void record() {
        System.out.println("Method record is called");
    }

    @Override
    public void pause() {
        System.out.println("Method pause is called");
    }

    @Override
    public void stop() {
        System.out.println("Method stop is called");
    }
}
