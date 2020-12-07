package visitor;

public class DurationVisitor implements Visitor{

    private double totalDuration = 0;

    @Override
    public void visit(Book b) {
        totalDuration += b.getNumberOfPages() * 5;

    }

    @Override
    public void visit(Video v) {
        totalDuration += v.getTime() + v.getTime()/30*5; //5 minute pauza la fiecare 30 min
    }

    @Override
    public void visit(Audio a) {
        totalDuration += a.getTime() + a.getNumberOfSongs() * 0.3;
    }

    public String toString(){
        return "The visited elements have a total duration of: " + totalDuration;
    }
}
