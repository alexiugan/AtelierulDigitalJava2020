package iterator;

import java.util.Iterator;

public class ArrayCustomIterator implements Iterator {

    int[] arr;
    int position = 0;

    public ArrayCustomIterator(int[] arr)
    {
        this.arr = arr;
    }

    public boolean hasNext(){
        if (position >= arr.length)
            return false;
        return true;
    }

    public Object next(){
        int obj = arr[position];
        position++;
        return obj;
    }
}
