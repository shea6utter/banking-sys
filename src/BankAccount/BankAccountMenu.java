package src.BankAccount;

import java.util.Scanner;

public class BankAccountMenu {
    
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("== Account Input ==");
        System.out.print("Account Number: ");
        int an = s.nextInt();
        s.nextLine();
        System.out.print("Account Name: ");
        String n = s.nextLine();
        System.out.print("Account Balance: ");
        double b = s.nextDouble();

        int t;
        do {
            System.out.println("== Account Type ==");
            System.out.println("1 | Checking Account");
            System.out.println("2 | Certificate of Deposit");
            System.out.println("3 | Savings Account");
            System.out.println("4 | Quit");
            System.out.print("Select Account Type: ");
            t = s.nextInt();
            System.out.println();

            if (t == 1) {
                System.out.println("== Checking Account Type ==");
                System.out.println("1 | Service Charge Checking Account\n2 | No Service Charge Checking Account\n3 | High Interest Checking Account");
                System.out.print("Select a Checking Account Type: ");
                int chType = s.nextInt();
                s.nextLine();
                System.out.println();
                
                // 0 for none
                System.out.print("Number of Check/s: ");
                int numCheck = s.nextInt();
                s.nextLine();

                // 0 for none
                System.out.print("Amount to write in check: ");
                double check = s.nextDouble();
                System.out.println();

                    switch (chType) {  
                        case 1:
                            final ServiceChargeChecking yesCheck = new ServiceChargeChecking(n, an, b);
                            
                            System.out.println("== Account Overview ==");
                            yesCheck.setNumberOfChecksWritten(numCheck);
                            yesCheck.createMonthlyStatement();
                            yesCheck.writeCheck(check);
                            yesCheck.createMonthlyStatement();
                            System.out.println();
                            break;
                        case 2:
                            final NoServiceChargeChecking noCheck = new NoServiceChargeChecking(n, an, b);

                            System.out.println("== Account Overview ==");
                            noCheck.createMonthlyStatement();
                            noCheck.writeCheck(check);
                            System.out.println(noCheck + "\n");
                            noCheck.createMonthlyStatement();
                            break;
                        case 3:
                            final HighInterestChecking hiCheck = new HighInterestChecking(n, an, b);

                            System.out.println("== Account Overview ==");
                            hiCheck.createMonthlyStatement();
                            hiCheck.writeCheck(check);
                            System.out.println(hiCheck + "\n");
                            hiCheck.createMonthlyStatement();
                            break;
                        default:
                            System.out.println("Invalid input. Please try again.");
                            break;
                    }
            } if (t == 2) {
                CertificationOfDeposit cod = new CertificationOfDeposit(n, an, b);

                System.out.println("== Certificate of Deposit ==");
                System.out.print("Months per term: ");
                int codmm = s.nextInt();
                s.nextLine();
                System.out.print("Current month in the term: ");
                int codcm = s.nextInt();
                s.nextLine();
                System.out.print("Rate of Interest: ");
                double codr = s.nextDouble();
                s.nextLine();
                System.out.println("== Account Overview ==");
                cod.setInterestRate(codr);                
                cod.setCurrentCDMonth(codcm);
                cod.setMaturityMonths(codmm);
                cod.postInterest();
                System.out.println();
                cod.createMonthlyStatement();

            } if (t == 3) {
                System.out.println("== Savings Account Menu ==");
                System.out.println("1 | No Min. Balance, Low Interest Rate");
                System.out.println("2 | Has Min. Balance, High Interest Rate");
                System.out.print("Select option: ");
                int saveOpt = s.nextInt();
                s.nextLine();
                System.out.println();

                    if (saveOpt == 1) {
                        SavingsAccount save = new SavingsAccount(n, an, b);  
                        System.out.println("== Account Overview ==");
                        save.createMonthlyStatement();
                        System.out.println();

                        System.out.println("== Withdraw Savings? ==");
                        System.out.println("1 | Yes\n2 | No");
                        System.out.print("Select option: ");
                        int wdOpt = s.nextInt();
                        s.nextLine();
                        System.out.println("");
                        
                            if (wdOpt == 1) {
                                System.out.println("== Withdrawal ==");
                                System.out.print("Amount to withdraw: ");
                                double amount = s.nextDouble();

                                double totalSave = save.getBalance() - amount;
                                
                                System.out.println("Amount Withdrawn: " + amount);
                                System.out.println("Account Balance: " + totalSave + "\n");
                                save.createMonthlyStatement();
                            } if (wdOpt == 2) {
                                System.out.println(save + "\n");
                                save.createMonthlyStatement();
                            }
                    } if (saveOpt == 2) {
                        HighInterestSavings hiSave = new HighInterestSavings(n, an, b);

                        System.out.println("== Account Overview ==");
                        hiSave.createMonthlyStatement();
                        System.out.println();

                        System.out.println("== Withdraw Savings? ==");
                        System.out.println("1 | Yes\n2 | No");
                        System.out.print("Select option: ");
                        int wdOpt = s.nextInt();
                        s.nextLine();
                        System.out.println("");

                        if (wdOpt == 1) {
                            System.out.println("== Withdrawal ==");
                            System.out.print("Amount to withdraw: ");
                            double amount = s.nextDouble();

                            hiSave.withdraw(amount);
                            System.out.println("\n" + hiSave + "\n");
                            hiSave.createMonthlyStatement();
                        } if (wdOpt == 2) {
                            System.out.println(hiSave + "\n");
                            hiSave.createMonthlyStatement();
                        }
                    }
            } if (t == 4) {
                System.out.println("== Quitting Program ==");
                System.exit(0);
            }
        } while (t < 0 || t > 3);

        System.out.println("== Thank you for your time. ==\n== Quitting Program ==");

        s.close();
        
    }
}
