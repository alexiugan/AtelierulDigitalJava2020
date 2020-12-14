package lab5.exchangeDesk;

public class ExchangeDesk {
    //sa convertim din clasa A in clasa B, folosind generics
    public <A extends Currency,B extends Currency> B exchange(A from, Class<B> to, float rate) {
        B toReturn = null;
        try {
            toReturn = to.getDeclaredConstructor().newInstance();
            toReturn.setValue(from.getValue() * rate);
        } catch (Exception e) {
            System.out.println(e);
        }
        return toReturn;
    }

}
