package chapter11.exercise03;

public class OverdraftException extends RuntimeException{

    public OverdraftException(){
        super("The transaction cannot be completed. Overdraft limit!");
    }
}
