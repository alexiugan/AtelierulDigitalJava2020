package lab3.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore chPizzaStore = new ChicagoPizzaStore();
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza p1 =  chPizzaStore.orderPizza("Margerita");
        Pizza p2 = nyPizzaStore.orderPizza("Margerita");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
