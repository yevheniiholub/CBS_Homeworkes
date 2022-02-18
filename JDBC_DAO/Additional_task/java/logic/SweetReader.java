package JDBC_DAO.Additional_task.java.logic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class SweetReader {
    private static final String SWEETS_PATH = "C:\\Users\\G33k0n\\IdeaProjects\\untitled\\src\\JDBC_DAO\\" +
            "Additional_task\\resources\\Input_sweets";

    public static List<String> readSweets()
    {
        List<String> result = new ArrayList<>();

        String buffer;
        try {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream
                    (SWEETS_PATH), StandardCharsets.UTF_8));
            buffer = bufferedReader.readLine();
            while (buffer != null) {
                result.add(buffer);
                buffer = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

        return result;
    }
}
