package src.BankAccount;

public abstract class BankAccount {
    protected int accountNumber;
    protected String name;
    protected double balance;
    
    BankAccount(final String n, final int an, final double a) {
        this.name = n;
        this.accountNumber = an;
        this.balance = a;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String n) {
        this.name = n;
    }
    
    public void withdraw(final double b) {
        this.balance -= b;
    }
    
    public void deposit(final double a) {
        this.balance += a;
    }
    
    public abstract void createMonthlyStatement();
    
    @Override
    public String toString() {
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.name + "\nBalance: " + this.balance;
    }
}
