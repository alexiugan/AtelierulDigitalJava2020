package lab6.ch4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);

        for(int i =0; i<list.size()-1;i++)
        {
            int x = list.get(i);
            int nextIndex = list.get(i+1);

            if(i%2==0)
            {
                if(x > nextIndex)
                {
                    list.add(i, nextIndex);
                    list.remove(i+2);
                }
            }
            else{
                if(x < nextIndex)
                {
                    list.add(i, nextIndex);
                    list.remove(i+2);
                }
            }
        }

        for(int nr: list)
            System.out.print(nr + " ");

    }
}
