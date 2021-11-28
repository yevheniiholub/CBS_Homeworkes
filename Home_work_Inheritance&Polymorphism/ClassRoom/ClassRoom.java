package HW2_3.ClassRoom;

public class ClassRoom {
    // Оголошення екземпляру класів для кожного учня
    private Pupil pupil;
    private ExcelentPupil excelentPupil;
    private GoodPupil goodPupil;
    private BadPupil badPupil;

    // Ініціалізація кожного поля
    public ClassRoom() {
        pupil = new Pupil();
        excelentPupil = new ExcelentPupil();
        goodPupil = new GoodPupil();
        badPupil = new BadPupil();
    }

    // Обробник для кожного екземпляру классу наслідуваного від Pupil
    private void showOnePupilInfo(Pupil anyPupil){
        System.out.println("Учень " + anyPupil.getPupilName());
        anyPupil.study();
        anyPupil.read();
        anyPupil.write();
        anyPupil.relax();
        System.out.println("Середня оцінка: " + anyPupil.getAverageMark() + '\n');
    }

    // Запуск обробника для кожного із існуючих полів
    public void showAllPupilsInfo() {
        showOnePupilInfo(pupil);
        showOnePupilInfo(excelentPupil);
        showOnePupilInfo(goodPupil);
        showOnePupilInfo(badPupil);
    }
}
