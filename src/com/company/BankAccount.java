package com.company;

public class BankAccount {
//     Create a new class for a bank account
//     Create fields for the account number, balance, customer name, email and phone number.
//
//     Create getters and setters for each field
//     Create two additional methods
//     1. To allow the customer to deposit funds (this should increment the balance field).
//     2. To allow the customer to withdraw funds. This should deduct from the balance field,
//     but not allow the withdrawal to complete if there are insufficient funds.
//     You will want to create various code in the Main class (the one created by IntelliJ) to
//     confirm your code is working.
//     Add some System.out.println's in the two methods above as well.

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        balance += amount;
    }

    public void withdrawFunds(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        }
    }
}
