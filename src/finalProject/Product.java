package finalProject;

public abstract class Product {
    protected String name;
    protected int quantity;

    public int getQuantity() {
        return quantity;
    }

    abstract public void addProducts(int nr);
    abstract public void sellProducts(int sold);

}
