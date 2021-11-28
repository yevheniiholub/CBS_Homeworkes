package Abstraction.Additional_task;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML file was opened");
    }

    @Override
    public void create() {
        System.out.println("XML file was created");
    }

    @Override
    public void change() {
        System.out.println("XML file was changed");
    }

    @Override
    public void save() {
        System.out.println("XML file was saved");
    }
}
