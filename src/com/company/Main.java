package com.company;

public class Main {

    public static void main(String[] args) {

        // TEST for SimpleCalculator Class
        System.out.println("-------------------- SimpleCalculator -----------------------");
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult()); // 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult()); // 1.0
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // 0.0
        System.out.println("divide= " + calculator.getDivisionResult()); // 0.0

        // TEST for Person Class
        System.out.println("-------------------- Person -----------------------");
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        // TEST for BankAccount Class
        System.out.println("-------------------- BankAccount -----------------------");
        BankAccount bankAccount = new BankAccount(1234567, 2121.00,"Sparrow", "stew.katz@gmail.com",1111234);
        System.out.println(bankAccount.getAccountNumber()); // 1234567
        System.out.println(bankAccount.getBalance()); // 2121.00
        System.out.println(bankAccount.getCustomerName()); // "Sparrow"
        System.out.println(bankAccount.getEmail()); // "stew.katz@gmail.com"
        System.out.println(bankAccount.getPhoneNumber()); // 1111234
        bankAccount.withdrawFunds(21);
        System.out.println(bankAccount.getBalance()); // 2100.00
        bankAccount.depositFunds(900);
        System.out.println(bankAccount.getBalance()); // 3000.00
        bankAccount.withdrawFunds(5000);
        System.out.println(bankAccount.getBalance()); // 3000.00
    }
}
