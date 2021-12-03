package Exceptions.Task_2;

/*
    Задание 2
    Создайте проект, используя IntelliJ IDEA.
    Требуется:
    Описать класс с именем Worker, содержащую следующие поля:
     фамилия и инициалы работника;
     название занимаемой должности;
     год поступления на работу.
    Написать программу, выполняющую следующие действия:
     ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
    быть упорядочены по алфавиту);
     если значение года введено не в соответствующем формате выдает исключение.
     вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */

import java.util.Scanner;

public class Main {
    static final int YEAR_OF_FOUNDATION = 1990;     // Рік заснування компанії
    static final int CURRENT_YEAR = 2021;           // Теперішній рік

    /*
     *  Збір інформації про працівників
     */
    public static void collectInfo(Worker [] workers) throws YearParser, NameSortingParser {
        String tempPosition;
        String tempName;
        Integer tempYear;

        for (int i = 0; i < workers.length; i++) {
            // Ввід ПІБ в тимчасову змінну
            System.out.println("Введіть ПІБ:");
            tempName = new Scanner(System.in).next();

            // Перевірка лічильника чи знаходиться він не на першому елементі, щоб наступною перевіркою не вийти
            // за межі масиву
            if (i > 0) {
                // Перевіряємо чи введене прізвище відповідає алфавітному порядку, якщо ні - тоді підіймаємо помилку
                if (tempName.compareToIgnoreCase(workers[i - 1].getName()) < 0) {
                    throw new NameSortingParser("Ввід працівників не по алфавітному порядку!");
                }
            }

            // Ввід посади в тимчасову змінну
            System.out.println("Введіть посаду:");
            tempPosition = new Scanner(System.in).next();

            // Ввід року працевлаштування
            System.out.println("Введіть рік працевлаштування:");
            tempYear = new Scanner(System.in).nextInt();

            // Перевірка на валідність року: це має бути трьохзначне число, і не має бути в діапазоні існування компанії
            if (tempYear.toString().length() < 4 || tempYear < YEAR_OF_FOUNDATION || tempYear > CURRENT_YEAR){
                throw new YearParser("Не валідний рік!");
            }

            // Викликаємо конструктор з параметрами які попередньо зчитали
            workers[i] = new Worker(tempName, tempPosition, tempYear);
        }
    }

    /*
     * Пошук працівника з необхідним стажем
     */
    public static void findEmployee(Worker [] workers) throws WrongExpInput {
        Integer requiredYears;

        // Зчитування стажу
        System.out.println("Введіть необхідний стаж");
        requiredYears = new Scanner(System.in).nextInt();

        // Якщо стаж перевищує період існування компанії
        if (requiredYears > CURRENT_YEAR - YEAR_OF_FOUNDATION){
            throw new WrongExpInput("Не валідний стаж: Стаж перевищує вік компанії!");
        }

        // Пошук працівника з введеним стажем
        for (Worker singleWorker : workers) {
            if (CURRENT_YEAR - singleWorker.getYear() >= requiredYears){
                System.out.println(singleWorker.getName());
            }
        }
    }

    public static void main(String[] args) {
        Worker [] workers = new Worker[5];

        try {
            collectInfo(workers);           // Збір даних
            findEmployee(workers);          // Пошук працівника
        }
        catch (YearParser | NameSortingParser | WrongExpInput e){
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }
}
