package finalProject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class EraserStock extends Product{
    private PropertyChangeSupport support;

    public EraserStock()
    {
        this.quantity = 0;
        support = new PropertyChangeSupport(this);
    }

    public EraserStock(int quantity)
    {
        this.quantity = quantity;
        support = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener pcl)
    {
        support.addPropertyChangeListener(pcl);
    }

    public void sellProducts(int sold)
    {
        if(this.getQuantity() >= sold)
        {
            support.firePropertyChange("quantity", this, new EraserStock(this.quantity - sold));
            this.quantity = quantity - sold;
        }
        else
            System.out.println("Not enough products in stock!");
    }

    public void addProducts(int nr)
    {
        support.firePropertyChange("quantity", this, new EraserStock(this.quantity + nr));
        this.quantity = quantity + nr;
    }
}
