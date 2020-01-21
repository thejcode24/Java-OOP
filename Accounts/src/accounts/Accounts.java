/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import accounts.Account;
import java.util.*;

/**
 *
 * @author thejcode24
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Account account1 = new Account("A", 10);
        Account account2 = new Account("B", 15);
        Account account3 = new Account("C", 5);

        transfer(account1, account2, 5);
        transfer(account2, account3, 2);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());

    }

}
