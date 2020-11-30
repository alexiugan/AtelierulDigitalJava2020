package lab3.p1;

import lab3.delegation.PayCalculator;

public class Employee {
    private String name;
    public void work(){
        System.out.println("Working");
    }
    //exemplu delegation
    public void calculatePay(PayCalculator p){
        System.out.println("Rest to pay: " + p.calculate("manager"));
    }
}
