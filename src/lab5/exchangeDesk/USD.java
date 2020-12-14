package lab5.exchangeDesk;

public class USD extends Currency{
    public USD(){super.setName("USD");}
    public USD(float value){
        super(value, "USD");
    }
}
