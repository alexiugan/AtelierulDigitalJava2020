package lab7.ch2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000, "ba1");
        BankAccount ba2 = new BankAccount(4000, "ba2");
        BankAccount ba3 = new BankAccount(2500, "ba3");

        TransactionThread t1 = new TransactionThread("t1", ba1, ba2, 2000);
        TransactionThread t2 = new TransactionThread("t2", ba1, ba3, 1900);

        t1.start();
        t2.start();


    }
}
