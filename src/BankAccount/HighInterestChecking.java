package src.BankAccount;

public class HighInterestChecking extends NoServiceChargeChecking {
    
    private static final double INTEREST_RATE = 0.05;
    private static final double MIN_BALANCE = 5000.0;
    
    HighInterestChecking(final String n, final int an, final double b) {
        super(n, an, b);
        this.minimumBalance = 5000.0;
        this.interestRate = 0.05;
    }
    
    HighInterestChecking(final String n, final int an, final double b, final double mb, final double ir) {
        super(n, an, b);
        this.minimumBalance = mb;
        this.interestRate = ir;
    }
    
    public double getInterestRate() {
        return this.interestRate;
    }
    
    public void setInterestRate(final double ir) {
        this.interestRate = ir;
    }
    
    public void postInterest() {
        this.balance += this.getBalance() * this.interestRate;
    }
    
    @Override
    public void createMonthlyStatement() {
        this.postInterest();
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
       return super.toString();
    }
}
