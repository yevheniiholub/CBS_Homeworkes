package HW2_3.DocumentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("Документ збережено в новому форматі!");;
    }
}
