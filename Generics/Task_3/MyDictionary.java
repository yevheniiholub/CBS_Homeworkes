package Generics.Task_3;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary<TKey,TValue> {
    private List<TKey> key;
    private List<TValue> value;

    public MyDictionary(){
        key = new ArrayList<>();
        value = new ArrayList<>();
    }

    public void add(TKey key, TValue value){
        this.key.add(key);
        this.value.add(value);
    }

    public void printElements(int index){
        System.out.print("Key: " + key.get(index));
        System.out.println(", Value: " + value.get(index));
    }

    public int size(){
        return key.size();
    }
}
