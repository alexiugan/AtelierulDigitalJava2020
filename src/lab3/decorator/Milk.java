package lab3.decorator;

public class Milk extends Topping{
    public Milk(Beverage wrappedBeverage) {
        super("Milk", 4, wrappedBeverage);
    }
}
