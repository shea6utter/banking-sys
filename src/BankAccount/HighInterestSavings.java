package src.BankAccount;

public class HighInterestSavings extends SavingsAccount {
   private static final double MINIMUM_BALANCE = 2500.00;
   private static final double INTEREST_RATE = 0.05;
   protected double minimumBalance;

   public HighInterestSavings(final String n, final int an, final double b) {
      super(n, an, b);
   }
   
   public static double getMinimumBalance() {
      return MINIMUM_BALANCE;
   }
   public boolean verifyMinimumBalance(double mb) {
      if (mb >= this.minimumBalance);
      return true;
   }

   public void withdraw() {}

   @Override
   public String toString() {
      return "";
   }
}
