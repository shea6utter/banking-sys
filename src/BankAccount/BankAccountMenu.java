package src.BankAccount;

import java.util.Scanner;

public class BankAccountMenu {
    
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("== Menu ==");
        System.out.print("Account Number: ");
        int an = s.nextInt();
        s.nextLine();
        System.out.print("Account Name: ");
        String n = s.nextLine();
        System.out.print("Account Balance: ");
        double b = s.nextDouble();

        int t;
        do {
            System.out.println("Account Type: ");
            System.out.println("1 | Checking Account");
            System.out.println("2 | Certificate of Deposit");
            System.out.println("3 | Savings Account");
            System.out.print("Select Account Type: ");
            t = s.nextInt();
            System.out.println();

            if (t == 1) {
                System.out.println("Checking Account Type: ");
                System.out.println("1 | Service Charge Checking Account");
                System.out.println("2 | No Service Charge Checking Account");
                System.out.print("Select a Checking Account Type: ");
                int chType = s.nextInt();
                s.nextLine();
                System.out.println();

                System.out.print("Number of Check/s: ");
                int numCheck = s.nextInt();
                s.nextLine();

                System.out.print("Amount to write in check:  ");
                double check = s.nextDouble();
                System.out.println();

                    switch (chType) {  
                        case 1:
                            final ServiceChargeChecking yesCheck = new ServiceChargeChecking(n, an, b);
                            System.out.println("== Account Overview ==");
                            yesCheck.setNumberOfChecksWritten(numCheck);
                            yesCheck.writeCheck(check);
                            System.out.print(yesCheck);
                            System.out.println();
                            break;
                        case 2:
                            NoServiceChargeChecking noCheck = new NoServiceChargeChecking(n, an, b);

                            System.out.println("== Account Overview ==");
                            noCheck.createMonthlyStatement();
                            noCheck.writeCheck(check);
                            noCheck.createMonthlyStatement();
                            break;
                        default:
                            System.out.println("Invalid input. Please try again.");
                            break;
                    }
            } if (t == 2) {
                CertificationOfDeposit cod = new CertificationOfDeposit(n, an, b);  
            } if (t == 3) {

            }
        } while (t < 0 || t > 3);

        System.out.println("");

        s.close();
    }
}
