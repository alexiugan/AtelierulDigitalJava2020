package visitor;

public class NameVisitor implements Visitor{

    private String name = "";

    @Override
    public void visit(Book b) {
        name+= b.getName() + " book, ";
    }

    @Override
    public void visit(Video v) {
        name+= v.getName() + " video, ";
    }

    @Override
    public void visit(Audio a) {
        name+= a.getName() + " audio, ";
    }

    public String toString(){
        return this.name;
    }
}
