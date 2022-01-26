package Serialization_XML_and_JSON.Additional_task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\G33kk0N\\IdeaProjects\\CBS_Homeworkes\\Serialization_XML_and_JSON\\" +
                "Additional_task\\serialized");
        Animal animal = new Animal("Lacky", 6, true);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(animal);
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        System.out.println(animal);
    }
}
