package lab5.exchangeDesk;

public class EUR extends Currency {
    public EUR(){super.setName("EUR");}
    public EUR(float value){
        super(value, "EUR");
    }
}
