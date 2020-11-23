package lab2.ch2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }

    public Actor[] getActori(){
        return this.actori;
    }

    public String getNume(){
        return this.nume;
    }
}
