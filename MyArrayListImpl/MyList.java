package MyArrayListImpl;

public interface MyList {
    void add(String strArg);
    void add(String strArg, int position);
    int size();
    boolean remove(String strArg);
    String remove(int position);
    void clear();
    void set(String strArg, int position);
    int indexOf(String strArg);
    String get(int position);
}
