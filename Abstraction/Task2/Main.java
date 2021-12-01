package Abstraction.Task2;

/*
    Задание 2
    Используя IntelliJ IDEA, создайте проект.Требуется:
    Создайте класс AbstractHandler.
    В теле класса создать методы void open(), void create(), void change(), void save().
    Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
    Написать программу, которая будет выполнять определение документа и для каждого формата должны
    быть методы открытия, создания, редактирования, сохранения определенного формата документа.
 */


public class Main {

    public static void processDocument(AbstractHandler argHandler){
        argHandler.create();
        argHandler.open();
        argHandler.change();
        argHandler.save();
        System.out.println();
    }

    public static void main(String[] args) {
        AbstractHandler [] varAbsHndDOC = {new DOCHandler(), new TXTHandler(), new XMLHandler()};

        for (AbstractHandler abstractHandler : varAbsHndDOC) {
            processDocument(abstractHandler);
        }
    }
    /*
        Вивід :

        DOC file was created
        DOC file was opened
        DOC file was changed
        DOC file was saved

        TXT file was created
        TXT file was opened
        TXT file was changed
        TXT file was saved

        XML file was created
        XML file was opened
        XML file was changed
        XML file was saved
     */
}
