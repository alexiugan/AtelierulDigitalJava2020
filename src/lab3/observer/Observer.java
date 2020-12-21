package lab3.observer;

import java.beans.PropertyChangeListener;

public interface Observer extends PropertyChangeListener {
    void update(String message);
}
