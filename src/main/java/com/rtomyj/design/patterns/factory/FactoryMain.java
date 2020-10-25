package com.rtomyj.design.patterns.factory;

public class FactoryMain {

    public static void main(String[] args)
    {

        System.out.println("--------IN FACTORY MAIN METHOD--------");
        final Account checkingAccount = SimpleFactory.createAccount(false, 100.0, "123456");
        System.out.println("Account info: " + checkingAccount.toString());
        System.out.println("Account status: " + checkingAccount.getAccountStatus());
        System.out.println("Does account occur interest?: " + checkingAccount.getAccountStatus());

        System.out.println();

        final Account savingsAccount = SimpleFactory.createAccount(true, 315.98, "908712");
        System.out.println("Account info: " + savingsAccount.toString());
        System.out.println("Account status: " + savingsAccount.getAccountStatus());
        System.out.println("Does account occur interest?: " + savingsAccount.getAccountStatus());

    }

}
