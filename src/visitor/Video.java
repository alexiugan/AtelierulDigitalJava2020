package visitor;

public class Video implements Element{
    private String name;
    private int time;

    public Video(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getName(){
        return this.name;
    }

    public int getTime(){
        return this.time;
    }
}
