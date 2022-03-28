package src.BankAccount;

public class CertificationOfDeposit extends BankAccount {
   private static final double INTEREST_RATE = 0.05;
   private static final int NUMBER_OF_MATURITY_MONTHS = 6;
   private double interestRate;
   private int maturityMonths;
   private int cdMonth;

   public CertificationOfDeposit(final String n, final int an, final double b) {
      super(n, an, b);
      this.interestRate = 0.05;
      this.maturityMonths = 6;
   }

   public CertificationOfDeposit(final String n, final int an, final double b, final double ir, final int mm) {
      super(n, an, b);
      this.interestRate = ir;
      this.maturityMonths = mm;
   }

   public double getInterestRate() {
      return this.interestRate;
   }

   public void setInterestRate(double ir) {
      this.interestRate = ir;
   }

   public double getCurrentCDMonth() {
      return this.cdMonth;
   }

   public void setCurrentCDMonth(int cdMonth) {
      this.cdMonth = cdMonth;
   }
   public int getMaturityMonths() {
      return this.maturityMonths;
   }

   public void setMaturityMonths(int mm) {
      this.maturityMonths = mm;
   }

   public void withdraw(double b) {
      
   }
   
   public void withdraw() {

   }

   public void createMonthlyStatement() {
      this.balance += this.getBalance() * this.interestRate;
      System.out.println(this.toString());
   }

   @Override
   public String toString() {
      String str = super.toString() + "\nDeposited amount: " + getBalance() + "\nAmount withdrawn: ";
      return str;
   }
}
