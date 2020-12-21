package lab3.observer;

import java.beans.PropertyChangeEvent;

public class Student implements Observer{

    String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }


    public void listenTo(Teacher teacher) {
    }
}
