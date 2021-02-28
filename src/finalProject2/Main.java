package finalProject2;

/*
 * Aplicatia demonstreaza folosirea unui Facade Pattern.
 * Astfel, cu ajutorul clasei LaptopPrice putem accesa cu usurinta datele referitoare
 * la preturile laptopurilor.
 */

public class Main {
    public static void main(String[] args) {
        LaptopPrice laptopPrice = new LaptopPrice();

        laptopPrice.asusPrice();
        laptopPrice.dellPrice();
        laptopPrice.samsungPrice();
    }
}
