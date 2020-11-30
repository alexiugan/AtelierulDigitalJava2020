package lab3.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("Margerita"))
        {
            return new ChicagoMargerita();
        }

        if(type.equals("Quatro"))
            return new ChicagoQuatro();

        return pizza;
    }
}
