/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author User
 */
public abstract class CheckingAccount extends BankAccount
{
    CheckingAccount(final String n, final int an, final double b) {
        super(n, an, b);
    }
    
    public abstract void writeCheck(final double b);
}
