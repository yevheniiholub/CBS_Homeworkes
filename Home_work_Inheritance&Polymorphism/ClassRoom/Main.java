package HW2_3.ClassRoom;

/*
    Задание 2
    Используя IntelliJ IDEA, создайте проект.
    Требуется:
    Создать класс, представляющий учебный класс ClassRoom.
    Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
    Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
    переопределите каждый из методов, в зависимости от успеваемости ученика.
    Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
    Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
    Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
    отдыхать.
 */

public class Main {
    public static void main(String[] args) {
        ClassRoom localClassRoom = new ClassRoom();     // Створення екземпляру класа ClassRoom
        localClassRoom.showAllPupilsInfo();             // Виклик результату

        /*
            Результат:

            Учень Pupil
            За тиждень було витрачено на начання 10 годин
            За тиждень було витрачено на читання 10 годин
            За тиждень було витрачено на письмо 10 годин
            За тиждень було витрачено на відпочинок 20 годин
            Середня оцінка: 3

            Учень ExcelentPupil
            За тиждень було витрачено на начання 20 годин
            За тиждень було витрачено на читання 20 годин
            За тиждень було витрачено на письмо 10 годин
            За тиждень було витрачено на відпочинок 0 годин
            Середня оцінка: 5

            Учень GoodPupil
            За тиждень було витрачено на начання 20 годин
            За тиждень було витрачено на читання 10 годин
            За тиждень було витрачено на письмо 10 годин
            За тиждень було витрачено на відпочинок 10 годин
            Середня оцінка: 4

            Учень BadPupil
            За тиждень було витрачено на начання 10 годин
            За тиждень було витрачено на читання 10 годин
            За тиждень було витрачено на письмо 0 годин
            За тиждень було витрачено на відпочинок 30 годин
            Середня оцінка: 2
         */
    }
}
