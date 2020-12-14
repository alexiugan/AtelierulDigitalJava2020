package lab5.ch2;

public class Pair<T extends Shoe>{
    private T first;
    private T second;


    public Pair(T firstElem, T secondElem) throws ShoesDontMatch
    {
        if(check(firstElem,secondElem))
        {
            throw new ShoesDontMatch();
        }
        this.first = firstElem;
        this.second = secondElem;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    private boolean check(T s1, T s2){
        if(!(s1.getColor().equals(s2.getColor())))
            return false;
        if(!(s1.getSize()==s2.getSize()))
            return false;
        return true;
    }
}
