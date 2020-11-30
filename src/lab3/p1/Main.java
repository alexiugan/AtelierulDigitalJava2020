package lab3.p1;

import lab3.delegation.PayCalculator;
import lab3.p1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        PayCalculator p = new PayCalculator();
        e.calculatePay(p);
    }

}
