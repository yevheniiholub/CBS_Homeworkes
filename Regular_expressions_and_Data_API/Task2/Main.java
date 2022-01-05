package Regular_expressions_and_Data_API.Task2;

/*
    Задание 2
    Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».
 */

import java.io.*;
import java.util.regex.Pattern;

public class Main {

    /*
        Зчитування файлу
     */
    public static String readFromFile(String fileName){
        StringBuilder stringBuilder = new StringBuilder();
        String temp;

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream
                    (fileName), "UTF8"));

            while ((temp = bufferedReader.readLine()) != null) {
                stringBuilder.append(temp);
                stringBuilder.append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    /*
        Запис в файл
     */
    public static void writeToFile(String fileName, String content, Pattern pattern){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream
                    (fileName), "UTF8"));

            // За допомогою replaceAll підставляємо замість сходженнями з pattern слово java
            bufferedWriter.write(content.replaceAll(pattern.toString(), "java"));
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<![_\\d\\p{L}])(?:это|как|так|и|в|над|к|до|не|на|но|за|то|с|ли|а|во|от|со|для|о|же|ну|вы|бы|что|кто|он|она)(?![_\\d\\p{L}])");
        String fileName = "C:\\Users\\Yevhenii\\IdeaProjects\\CBS_Homeworkes\\Regular_expressions_and_Data_API\\Task2\\File";
        String content;

        content = readFromFile(fileName);
        writeToFile(fileName, content, pattern);
    }
}
