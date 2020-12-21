package lab5.ch4;

public class ArrayIterator<T> implements IArrayIterator<T>{
    T[] arr;
    int position = 0;

    public ArrayIterator(T[] arr)
    {
        this.arr = arr;
    }

    public boolean hasNext(){
        if (position >= arr.length)
            return false;
        return true;
    }

    public T next(){
        T obj = arr[position];
        position++;
        return obj;
    }
}
