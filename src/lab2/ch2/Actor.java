package lab2.ch2;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii){
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }

    public String getNume(){
        return this.nume;
    }

    public int getVarsta(){
        return this.varsta;
    }
}
