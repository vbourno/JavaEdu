package gr.aueb.cf.ch15.exceptions;

public class InsufficientAmountException extends Exception {
    private static final long serialversionUID = 1L;

    public InsufficientAmountException(double amount) {
        super("Amount " + amount + " is insufficient");
    }
}
