package finalProject2;

public class LaptopPrice {
    private Laptop asus;
    private Laptop dell;
    private Laptop samsung;

    public LaptopPrice(){
        asus = new Asus();
        dell = new Dell();
        samsung = new Samsung();
    }

    public void asusPrice(){
        asus.getBrand();
        asus.getPrice();
    }

    public void dellPrice(){
        dell.getBrand();
        dell.getPrice();
    }

    public void samsungPrice(){
        samsung.getBrand();
        samsung.getPrice();
    }
}
