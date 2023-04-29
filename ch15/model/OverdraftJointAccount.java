package gr.aueb.cf.ch15.model;

import gr.aueb.cf.ch15.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.exceptions.SsnNotValidException;

public class OverdraftJointAccount extends JointAccount {

    public OverdraftJointAccount() {}

    public OverdraftJointAccount(User firstholder, User secondHolder, String iban, double balance) {
        super(firstholder, secondHolder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            setBalance(getBalance() - amount);
        } catch (SsnNotValidException e) {
            System.err.println("Error in Ssn" + "\n" + e);
            throw e;
        }
    }
}
