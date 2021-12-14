package Generics.Task_2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> array;

    public MyList(){
        array = new ArrayList<> ();
    }

    public void add(T element){
        array.add(element);
    }

    public T get(int index){
        return array.get(index);
    }

    public int getSize(){
        return  array.size();
    }
}
