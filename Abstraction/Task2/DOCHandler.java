package Abstraction.Task2;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("DOC file was opened");
    }

    @Override
    public void create() {
        System.out.println("DOC file was created");
    }

    @Override
    public void change() {
        System.out.println("DOC file was changed");
    }

    @Override
    public void save() {
        System.out.println("DOC file was saved");
    }
}
