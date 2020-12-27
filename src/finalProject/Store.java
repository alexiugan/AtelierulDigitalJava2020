package finalProject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class Store implements PropertyChangeListener{
    private HashMap<Product, Integer> products;
    private int productsInStock;

    public Store(){
        products=  new HashMap<>();
        productsInStock = 0;
    }

    public void addProduct(Product p)
    {
        this.products.put(p, p.getQuantity());
        productsInStock += p.getQuantity();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        productsInStock = 0;
        for(Product p : products.keySet())
        {
            if(p.getClass().equals(evt.getOldValue().getClass()))
            {
                Product newP = (Product) evt.getNewValue();
                products.put(p, newP.getQuantity());
            }
            productsInStock += products.get(p);
        }
    }

    public int getProductsInStock(){
        return this.productsInStock;
    }
}
