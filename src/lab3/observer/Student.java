package lab3.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Student implements Observer {

    String name="";
    String course="";

    public Student(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        course = (String)evt.getNewValue();
    }


    public void listenTo(Teacher teacher) {
        System.out.println("Student " + name + " learned about " + teacher.course);
    }
}
