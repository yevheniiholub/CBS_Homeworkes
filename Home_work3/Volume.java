package Home_work3;

public class Volume {
    public static void main(String[] args) {
        /*
            Задание 4
            Используя IntelliJ IDEA, создайте класс Volume.
            Напишите программу расчета объема - V и площади поверхности -S цилиндра.
            Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
            Площадь S поверхности цилиндра вычисляется по формуле:
            S = 2πR2 + 2πR2 = 2πR(R+h)
            Результаты расчетов выведите на экран.
        */

        // Об'явлення
        double V;
        double S;
        double R;
        double h;

        // Ініціалізація
        R = 15.0d;
        h = 45.0d;

        // Розрахунок
        V = Math.PI * Math.pow(R, 2) * h;
        S = 2 * Math.PI * R * (R + h);

        // Вивід
        System.out.println("Об'єм = " + V);
        System.out.println("Площа = " + S);

        // Результат : Об'єм = 31808.625617596656
        //             Площа = 5654.8667764616275
    }
}
