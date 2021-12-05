package MyArrayListImpl;

public class MyArrayListImpl implements MyList{
    private final int INITIAL_ARRAY_SIZE = 10;
    private String [] strArray;
    private int tail;

    public String[] getStrArray() {
        return strArray;
    }

    public MyArrayListImpl() {
        strArray = new String[INITIAL_ARRAY_SIZE];
        tail = 0;
    }

    private void rangeCheck(int position) {
        if (position < 0 || position > tail)
            throw new IndexOutOfBoundsException("Position :" + position + " out of bounds");
    }

    private String [] extendArray(String [] argArray){
        String [] BufferArray = new String[strArray.length * 2];
        System.arraycopy(strArray, 0, BufferArray, 0, strArray.length);
        strArray = BufferArray;
        return (BufferArray);
    }

    @Override
    public void add(String strArg) {
        add(strArg, tail);
    }

    @Override
    public void add(String strArg, int position) {
        rangeCheck(position);
        if (strArray.length < tail + 1){
            strArray = extendArray(strArray);
        }
        System.arraycopy(strArray, position, strArray, position + 1, tail - position);
        set(strArg, position);
        tail++;
    }

    @Override
    public int size() {
        return tail;
    }

    @Override
    public boolean remove(String strArg) {
        int index = indexOf(strArg);
        if (index > 0){
            remove(index + 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String remove(int position) {
        String removedString;
        rangeCheck(position);
        removedString = strArray[position];
        System.arraycopy(strArray, position, strArray, position - 1, tail - position);
        set(null, tail - 1);
        tail--;
        return removedString;
    }

    @Override
    public void clear() {
        if (tail > 0){
            for (int i = 0; i < tail; i++) {
                set(null, i);
            }
        }
        tail = 0;
    }

    @Override
    public void set(String strArg, int position) {
        rangeCheck(position);
        strArray[position] = strArg;
    }

    @Override
    public int indexOf(String strArg) {
        for (int i = 0; i < tail - 1; i++) {
            if (strArray[i].equals(strArg)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int position) {
        rangeCheck(position + 1);
        return strArray[position];
    }
}
