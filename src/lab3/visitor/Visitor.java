package lab3.visitor;

public interface Visitor {
    void visit(Book b);
    void visit(Video v);
    void visit(Audio a);
}
