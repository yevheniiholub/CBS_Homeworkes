package IO_and_Strings.Additional_task;

/*
    Задание
    Создайте в package текстовый файл и клас, внесите в файл некий текст.
    Выведите на экран содержимое файла.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String buffer;
        try {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream
                    ("C:\\Users\\Yevhenii\\IdeaProjects\\CBS_Homeworkes\\IO_and_Strings\\Additional_task\\Task.txt"),
                    StandardCharsets.UTF_8));
            buffer = bufferedReader.readLine();
            while (buffer != null) {
                System.out.println(buffer);
                buffer = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
