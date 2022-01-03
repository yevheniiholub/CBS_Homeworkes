package Regular_expressions_and_Data_API.Task3;

/*
    Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
    С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном для восприятия
    виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
 */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void printDateDifference(){
        // Константи для конвертації
        final long MILISEC_IN_YEARS = 31536000000L;
        final long MILISEC_IN_MONTH = 2629800000L;
        final long MILISEC_IN_DAY = 86400000L;
        final long MILISEC_IN_HOUR = 3600000L;
        final long MILISEC_IN_MINUTE = 60000L;
        final long MILISEC_IN_SECOND = 1000L;

        // Конструкція для конвертації LocalDateTime в Date (Рішення знайшов на stackoverflow)
        Date in = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());

        // Допоміжні змінні
        Scanner scanner = new Scanner(System.in);
        long userDate;
        long difference;

        // Прийом строки від користувача, і парсинг через Date.parse з=щоб отримати результат в мілісекундах
        System.out.println("Введть дату народження в форматі РРРР/ММ/ДД/ГГ:ХХ:СС");
        userDate = Date.parse(scanner.nextLine());

        // Знаходимо різницю в мілісекундах
        difference = out.getTime() - userDate;
        String format = "З вказаної дати пройшло %d років, %d місяців, %d днів, %d годин, %d секунд\n";

        // Виводимо конвертованні значення
        System.out.printf(format, (difference / MILISEC_IN_YEARS),
                ((difference % MILISEC_IN_YEARS) / MILISEC_IN_MONTH),
                ((difference % MILISEC_IN_MONTH) / MILISEC_IN_DAY),
                ((difference % MILISEC_IN_DAY) / MILISEC_IN_HOUR),
                ((difference % MILISEC_IN_HOUR) / MILISEC_IN_MINUTE),
                ((difference % MILISEC_IN_MINUTE) / MILISEC_IN_SECOND));
    }

    public static void main(String[] args) {
        printDateDifference();
    }
}