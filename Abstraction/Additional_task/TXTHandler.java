package Abstraction.Additional_task;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXT file was opened");
    }

    @Override
    public void create() {
        System.out.println("TXT file was created");
    }

    @Override
    public void change() {
        System.out.println("TXT file was changed");
    }

    @Override
    public void save() {
        System.out.println("TXT file was saved");
    }
}
