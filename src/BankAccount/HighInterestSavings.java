package src.BankAccount;

public class HighInterestSavings extends SavingsAccount {
   private static final double MINIMUM_BALANCE = 2500.00;
   private static final double INTEREST_RATE = 0.05;
   protected double minimumBalance;
   private double interestRate;

   public HighInterestSavings(final String n, final int an, final double b) {
      super(n, an, b);
      this.minimumBalance = 2500.00;
      this.interestRate = 0.05;
   }

   public HighInterestSavings(final String n, final int an, final double b, final double mb, final double ir) {
      super(n, an, b);
      this.minimumBalance = mb;
      this.interestRate = ir;
   }
   
   public double getMinimumBalance() {
      return this.minimumBalance;
   }

   public 

   public boolean verifyMinimumBalance(final double mb) {
      return mb >= this.minimumBalance;
   }

   public double getInterestRate() {
      return this.interestRate;
   }

   public void setInterestRate(final double ir) {
      this.interestRate = ir;
   }

   public void withdraw(final double mb) {
      final double tempAmount = this.getBalance() - mb;
      if (this.verifyMinimumBalance(tempAmount)) {
         this.balance -= mb;
      } else {
         System.out.println("Insufficient Balance. ");
      }
   }

   @Override
   public String toString() {
      String str = super.toString() + "\nHigh Interest Savings Account Type";
      str = str + "\nRequired Minimum Balance: " + this.getMinimumBalance() + "\nInterest Rate: " + this.getInterestRate();
      return str;
   }
}
