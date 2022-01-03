package IO_and_Strings.Task_2;

/*
Задание 2
    Создайте файл, запишите в него произвольные данные и закройте файл. Затем снова откройте этот файл,
    прочитайте из него данные и выведете их на консоль.

 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String buffer;
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream
                    ("C:\\Users\\Yevhenii\\IdeaProjects\\CBS_Homeworkes\\IO_and_Strings" +
                    "\\Task_2\\Main.txt"), "Cp866"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream
                    ("C:\\Users\\Yevhenii\\IdeaProjects\\CBS_Homeworkes\\IO_and_Strings" +
                            "\\Task_2\\Main.txt"), "Cp866"));
            bufferedWriter.write("Some info\nline1\nline2");
            bufferedWriter.flush();
            bufferedWriter.close();

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
