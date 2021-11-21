package HW2_3.DocumentWorker;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    public void editDocument() {
        System.out.println("Документ відредаговано!");;
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ збережено в базовому форматі. Зберігання в інших форматах доступно в версії" +
                " Expert");;
    }
}
