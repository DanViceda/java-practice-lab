/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExEncapsulation;

/**
 *
 * @author danvicedaa
 */
public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    private double deposit;
    private double withdraw;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder.isEmpty()){
            System.out.println("Account holder can't be empty!");
        }else{
            this.accountHolder = accountHolder;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0){
            this.accountNumber = accountNumber;
        }else{
            System.out.println("Account Number can't be negative! ");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance can't be negative numbers!");
        }
    }
}
