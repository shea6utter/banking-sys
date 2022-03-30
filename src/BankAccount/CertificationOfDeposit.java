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

   public void setInterestRate(final double ir) {
      this.interestRate = ir;
   }

   public double getCurrentCDMonth() {
      return this.cdMonth;
   }

   public void setCurrentCDMonth(final int cdM) {
      this.cdMonth = cdM;
   }
   
   public int getMaturityMonths() {
      return this.maturityMonths;
   }

   public void setMaturityMonths(final int mm) {
      this.maturityMonths = mm;
   }

   public void postInterest() {
      this.balance += (getBalance()*((double) Math.pow((1 + (getInterestRate()/6)),(6*(getCurrentCDMonth()/6)))));
        System.out.println("Post-Interest: "+this.balance);
  }

  public void withdraw(final double b) {
      this.balance -= b;
     
  }

  public void withdraw() {}

   @Override
   public void createMonthlyStatement() {
      this.postInterest();
      System.out.println(this.toString());
   }

   @Override
   public String toString() {
      String str = super.toString() + "\nInterest Rate: " + this.interestRate + "\nMaturity Months: " + this.maturityMonths;
      return str;
   }
}
