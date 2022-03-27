package src.BankAccount;

public class SavingsAccount extends BankAccount {
   private static final double INTEREST_RATE = 0.03;
   protected double interestRate;
   
   public SavingsAccount(final String n, final int an, final double b) {
      super(n, an, b);
   }

   public double getInterestRate() {
      return interestRate;
   }

   public void setInterestRate(double interestRate) {
      this.interestRate = interestRate;
   }
   
   public void postInterest() {

   }

   public void createMonthlyStatement() {
      this.balance += this.getBalance() * this.interestRate;
      System.out.println(this.toString());
   }
   
   @Override
   public String toString() {
      return null;
   }
}
