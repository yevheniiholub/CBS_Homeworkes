package HW2_3.DocumentWorker;

import java.util.Scanner;


public class Main {
    public static void processDocumentWorker(DocumentWorker userDocumentWorker){
        userDocumentWorker.openDocument();
        userDocumentWorker.editDocument();
        userDocumentWorker.saveDocument();
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DocumentWorker userDocVersion;

        System.out.println("Введіть ключ версії");

        switch (userInput.nextLine()){
            case "":
                userDocVersion = new DocumentWorker();
                break;
            case "pro":
                userDocVersion = new ProDocumentWorker();
                break;
            case "exp":
                userDocVersion = new ExpertDocumentWorker();
                break;
            default:
                System.out.println("Не корректно введений ключ версії!");
                return;
        }

        processDocumentWorker(userDocVersion);

        /*
            Результат:

            Введіть ключ версії

            Документ відкрито!
            Редагування документу доступно лише в про версії
            Зберігання документу доступно лише в про версії

            Введіть ключ версії
            pro
            Документ відкрито!
            Документ відредаговано!
            Документ збережено в базовому форматі. Зберігання в інших форматах доступно в версії Expert

            Введіть ключ версії
            exp
            Документ відкрито!
            Документ відредаговано!
            Документ збережено в новому форматі!

            Введіть ключ версії
            bla
            Не корректно введений ключ версії!
         */
    }
}
