package JDBC_and_Hibernate.JDBC.Task3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public static List<String> getQueries()
    {
        List<String> result = new ArrayList<>();

        String buffer;
        try {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream
                    ("C:\\Users\\G33k0n\\IdeaProjects\\untitled\\src\\JDBC_and_Hibernate\\JDBC\\Task3\\Queries"),
                    StandardCharsets.UTF_8));
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
