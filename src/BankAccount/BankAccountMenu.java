package src.BankAccount;

import java.util.Scanner;

public class BankAccountMenu {
    
    public static void main(final String[] args) {
        final ServiceChargeChecking Account1 = new ServiceChargeChecking("Vera", 101, 1000.0);
        NoServiceChargeChecking Account2 = new NoServiceChargeChecking("Kim", 1022, 10000.0);
        final ServiceChargeChecking Account3 = new ServiceChargeChecking("Tequin", 190, 6000.0);
        System.out.println("== Account 1 ==");
        System.out.print(Account1);
        Account1.writeCheck(300.0);
        System.out.print(Account1);
        System.out.println();
        System.out.println("== Account 2 ==");
        Account2.createMonthlyStatement();
        Account2.writeCheck(5000.0);
        Account2.createMonthlyStatement();
        System.out.println("== Account 3 ==");
        Account3.createMonthlyStatement();
        Account3.writeCheck(5000.0);
        Account3.createMonthlyStatement();
        System.out.println("== Account 2 ==");
        Account2.createMonthlyStatement();
        Account2.writeCheck(5000.0);
        Account2.createMonthlyStatement();
    }
}
