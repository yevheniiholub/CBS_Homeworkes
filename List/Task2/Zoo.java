package List.Task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<String> animals;

    public Zoo() {
        animals = new ArrayList<String>();
    }

    public void addAnimal(int indexAnimal, String newAnimal){
        animals.add(indexAnimal, newAnimal);
    }

    public void printAnimals() {
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

    }

    public ArrayList<String> getAnimals() {
        return animals;
    }
}
