package Serialization_XML_and_JSON.Task_2;

/*
    Задание 2
    Необходимо осуществить десериализацию с файла предыдущего проекта(Animal) и вывести на экран содержимое.
 */

import Serialization_XML_and_JSON.Additional_task.Animal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Animal deserializedAnimal;
        File file = new File("C:\\Users\\G33kk0N\\IdeaProjects\\CBS_Homeworkes\\Serialization_XML_and_JSON\\" +
                "Additional_task\\serialized");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            deserializedAnimal = (Animal) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
}
