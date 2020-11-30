package lab3.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("Margerita"))
        {
            return new NYMargerita();
        }

        if(type.equals("Quatro"))
            return new NYQuatro();

        return pizza;
    }
}
