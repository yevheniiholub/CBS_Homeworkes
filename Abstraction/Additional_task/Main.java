package Abstraction.Additional_task;

import Abstraction.Task2.AbstractHandler;
import Abstraction.Task2.DOCHandler;
import Abstraction.Task2.TXTHandler;
import Abstraction.Task2.XMLHandler;

public class Main {
    /*
    Задание
    Используя IntelliJ IDEA, создайте проект.
    Требуется: Изменить 12 пример первого урока (работа с документом) и создать общий абстрактный класс
    для всех частей документа.
     */

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
