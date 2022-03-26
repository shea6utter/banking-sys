/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author User
 */
public class NoServiceChargeChecking extends CheckingAccount {
    
    private static final double MIN_BALANCE = 1000.0;
    private static final double INTEREST_RATE = 0.02;
    protected double minimumBalance;
    protected double interestRate;
    
    NoServiceChargeChecking(final String n, final int an, final double b) {
        super(n, an, b);
        this.minimumBalance = 1000.0;
        this.interestRate = 0.02;
    }
    
    NoServiceChargeChecking(final String n, final int an, final double b, final double mb, final double ir) {
        super(n, an, b);
        this.minimumBalance = mb;
        this.interestRate = ir;
    }
    
    public double getMinimumBalance() {
        return this.minimumBalance;
    }
    
    public void setMinimumBalance(final double mb) {
        this.minimumBalance = mb;
    }
    
    public boolean verifyMinimumBalance(final double mb) {
        return mb >= this.minimumBalance;
    }
    
    @Override
    public void writeCheck(final double a) {
        this.withdraw(a);
    }
    
    @Override
    public void withdraw(final double a) {
        final double tempAmount = this.getBalance() - a;
        if (this.verifyMinimumBalance(tempAmount)) {
            this.balance -= a;
        }
        else {
            System.out.println("Insufficienct balance.");
        }
    }
    
    @Override
    public void createMonthlyStatement() {
        this.balance += this.getBalance() * this.interestRate;
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        String str = super.toString() + "\nNo Service Charge Checking Account Type\nRequired Minimum Balance: ";
        str += this.getMinimumBalance();
        str = str + "\nInterest Rate: " + this.interestRate + "\n";
        return str;
    }
}
