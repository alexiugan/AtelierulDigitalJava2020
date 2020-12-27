package lab3.observer;

import java.beans.PropertyChangeSupport;

public class Teacher implements ObservedSubject{
    String course="";

    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    @Override
    public void register(Observer obj) {
        support.addPropertyChangeListener(obj);
    }

    @Override
    public void unregister(Observer obj) {
        support.removePropertyChangeListener(obj);
    }

    @Override
    public void notifyObservers(String message) {
        support.firePropertyChange("course", course, message);
        course = message;
    }

    public void teach(String javaTopic) {
        course = javaTopic;
    }
}
