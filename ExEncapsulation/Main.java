/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExEncapsulation;

/**
 *
 * @author danvicedaa Example of Encapsulation
 *
 */
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static BankAccount account;

    public static void main(String[] args) {

        System.out.println("Bank Account\n");

        System.out.print("Enter Account Holder: ");
        String accHolder = input.nextLine().trim();

        System.out.print("Enter Account Number: ");
        int accNumber = input.nextInt();

        System.out.print("Enter Balance: ");
        double balance = input.nextDouble();

        account = new BankAccount(accHolder, accNumber, balance);
        System.out.println("\n\nLogin Successfully!\n");

        System.out.println("Account Details");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        
        System.out.print("Enter Deposit Amount: ");
        double deposit = input.nextDouble();
        account.deposit(deposit);

        System.out.println("Current Balance: " + account.getBalance());

        System.out.print("\nEnter Withdraw Amount: ");
        double withdraw = input.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Current Balance: " + account.getBalance());

    }
}
