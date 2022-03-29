package src.BankAccount;

public class SavingsAccount extends BankAccount {
   private static final double INTEREST_RATE = 0.03;
   protected double interestRate;
   
   public SavingsAccount(final String n, final int an, final double b) {
      super(n, an, b);
      this.interestRate = 0.03;
   }

   public SavingsAccount(final String n, final int an, final double b, final double ir) {
      super(n, an, b);
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

   public void createMonthlyStatement() {
      this.postInterest();
      System.out.println(this.toString());
   }
   
   @Override
   public String toString() {
      String str = super.toString();
      return str;
   }
}
