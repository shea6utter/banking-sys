package src.BankAccount;

public class ServiceChargeChecking extends CheckingAccount {
    
    private static final double ACCOUNT_SERVICE_CHARGE = 10.0;
    private static final int MAXIMUM_NUM_OF_CHECKS = 5;
    private static final double SERVICE_CHARGE_EXCESS_NUM_OF_CHECKS = 5.0;
    protected double serviceChargeAccount;
    protected double serviceChargeCheck;
    protected int numberOfChecksWritten;
    
    ServiceChargeChecking(final String n, final int an, final double b) {
        super(n, an, b);
        this.serviceChargeAccount = 10.0;
        this.serviceChargeCheck = 5.0;
        this.numberOfChecksWritten = 0;
    }
    
    ServiceChargeChecking(final String n, final int an, final double b, final double serCA, final double serCC) {
        super(n, an, b);
        this.serviceChargeAccount = serCA;
        this.serviceChargeCheck = serCC;
        this.numberOfChecksWritten = 0;
    }
    
    public double getServiceChargeAccount() {
        return this.serviceChargeAccount;
    }
    
    public void setServiceChargeAccount(final double a) {
        this.serviceChargeAccount = a;
    }
    
    public double getServiceChargeCheck() {
        return this.serviceChargeCheck;
    }
    
    public void setServiceChargeCheck(final double a) {
        this.serviceChargeCheck = a;
    }
    
    public int getNumberOfChecksWritten() {
        return this.numberOfChecksWritten;
    }
    
    public void setNumberOfChecksWritten(final int n) {
        this.numberOfChecksWritten = n;
    }
    
    public void postServiceCharge() {
        this.balance -= this.getServiceChargeAccount();
    }
    
    @Override
    public void writeCheck(final double b) {
        if (this.getBalance() > this.getServiceChargeAccount() + b) {
            if (this.getNumberOfChecksWritten() > 5) {
                if (this.getBalance() > this.getServiceChargeCheck() + this.getServiceChargeAccount() + b) {
                    this.balance -= this.serviceChargeCheck;
                }
                else {
                    System.out.println("Not enough balance.");
                }
            }
            this.postServiceCharge();
            this.withdraw(b);
        }
        else {
            System.out.println("Not enough balance.");
        }
    }
    
    @Override
    public void createMonthlyStatement() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        String str = super.toString() + "\nService Checking Account Type\nNumber of checks: " + this.numberOfChecksWritten;
        str = str + "\nService Charge Account: " + this.serviceChargeAccount + "\n";
        if (this.getNumberOfChecksWritten() > 5) {
            str = str + "\nService Charge for excess number of checks: " + this.getServiceChargeCheck() + "\n";
        }
        return str;
    }
}
