package src.BankAccount;

public abstract class CheckingAccount extends BankAccount
{
    CheckingAccount(final String n, final int an, final double b) {
        super(n, an, b);
    }
    
    public abstract void writeCheck(final double b);
}
