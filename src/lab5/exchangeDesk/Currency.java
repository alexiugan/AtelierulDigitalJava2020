package lab5.exchangeDesk;

public class Currency {
    private String name;
    private float value;

    public Currency(float value, String name)
    {
        this.value=value;
        this.name= name;
    }

    public Currency()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
