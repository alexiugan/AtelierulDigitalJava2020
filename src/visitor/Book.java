package visitor;

public class Book implements Element{

    private int numberOfPages;
    private String name;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public Book(int numberOfPages, String name) {
        this.numberOfPages = numberOfPages;
        this.name = name;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public String getName(){
        return this.name;
    }
}
