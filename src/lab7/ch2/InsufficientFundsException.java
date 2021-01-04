package lab7.ch2;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Not enough money in your account!");
    }
}
