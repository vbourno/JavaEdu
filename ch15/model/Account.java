package gr.aueb.cf.ch15.model;

import gr.aueb.cf.ch15.exceptions.InsufficientAmountException;
import gr.aueb.cf.ch15.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.exceptions.SsnNotValidException;

public class Account extends IdentifiableEntity {
    private String iban;
    private User holder;
    private double balance;

    public Account() {
    }

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = new User(holder);
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return new User(holder);
    }

    public void setHolder(User holder) {
        this.holder = new User(holder);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    // Service layer - Public API

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
        if ((ssn == null) || (holder.getSsn() == null)) {
            return false;
        }
        return holder.getSsn().equals(ssn);
    }

    public double getAccountBalance() {
        return balance;
    }
}
