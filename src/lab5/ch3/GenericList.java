package lab5.ch3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> implements IGenericList<T>{
    List<T> list;

    GenericList(T root){
        list = new ArrayList<>();
    }

    @Override
    public void insert(T element) {
        list.add(element);
    }

    @Override
    public void println() {
        for(T e: list)
            System.out.print(e +" ");
    }
}
