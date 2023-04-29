package gr.aueb.cf.ch15.model;

import gr.aueb.cf.ch15.exceptions.InsufficientAmountException;
import gr.aueb.cf.ch15.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.exceptions.SsnNotValidException;

public class JointAccount extends IdentifiableEntity {
    private User firstholder;
    private User secondHolder;
    private String iban;
    private double balance;

    public JointAccount() {
    }

    public JointAccount(User firstholder, User secondHolder, String iban, double balance) {
        this.firstholder = firstholder;
        this.secondHolder = secondHolder;
        this.iban = iban;
        this.balance = balance;
    }

    public User getFirstholder() {
        return new User(firstholder);
    }

    public void setFirstholder(User firstholder) {
        this.firstholder = new User(firstholder);
    }

    public User getSecondHolder() {
        return new User(secondHolder);
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = new User(secondHolder);
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "firstholder=" + firstholder +
                ", secondHolder=" + secondHolder +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    /**
     * Deposits a certain amount of money into user-account.
     *
     * @param amount
     * @throws InsufficientAmountException
     */
    public void deposit(double amount) throws InsufficientAmountException {
        try {
            if (amount < 0) {
                throw new InsufficientAmountException(amount);
            }
            balance += amount;
        } catch (InsufficientAmountException e) {
            System.err.println("Error: Insufficient amount exception");
            throw e;
        }
    }

    /**
     *
     * @param amount
     * @param ssn
     * @throws InsufficientBalanceException
     * @throws SsnNotValidException
     */
    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;
        } catch (InsufficientBalanceException | SsnNotValidException e) {
            System.err.println("Error: withdrawal");
            throw e;
        }
    }

    /**
     *
     * @param ssn
     * @return
     */
    protected boolean isSsnValid(String ssn) {
        if ((ssn == null) || (firstholder.getSsn() == null) || (secondHolder.getSsn() == null)) {
            return false;
        }
        return firstholder.getSsn().equals(ssn) || secondHolder.getSsn().equals(ssn);
    }

    public double getAccountBalance() {
        return balance;
    }
}
