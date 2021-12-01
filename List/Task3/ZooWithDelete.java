package List.Task3;

import List.Task2.Zoo;

import java.util.ArrayList;

public class ZooWithDelete extends Zoo {
    public void removeAnimal(int animalIndex){
        getAnimals().remove(animalIndex);
    }
}
