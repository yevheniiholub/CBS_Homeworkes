package IO_and_Strings.Task_3;

/*
    Задание 3
    Необходимо создать строку с текстом (текст взять любой из интернета). Разбить эту строку на
    2 подстроки равной длине и вывести на экран каждое предложения с новой строки.

 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String strVar = "Необходимо создать строку с текстом (текст взять любой из интернета). Разбить эту строку на" +
                " 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.";
        StringBuffer firstPart;
        StringBuffer secondPart;
        StringWriter stringWriter = new StringWriter(strVar.length()/2);

        try {
            // Зчитуємо від нуля, кількість символів, яка дорівнює половині довжини строки
            stringWriter.write(strVar, 0, strVar.length()/2);
            firstPart = stringWriter.getBuffer();

            // Реініціалізація stringWriter
            stringWriter = new StringWriter(strVar.length()/2);

            // Зчитуємо від середини, кількість символів, яка дорівнює половині довжини строки
            stringWriter.write(strVar, strVar.length()/2, strVar.length()/2);
            secondPart = stringWriter.getBuffer();

            stringWriter.close();

            // Виводимо на екран строки
            System.out.println(firstPart);
            System.out.println(secondPart);
        }
        catch (IllegalArgumentException | IOException e){
            System.err.println(e.getMessage());
        }


    }
}
