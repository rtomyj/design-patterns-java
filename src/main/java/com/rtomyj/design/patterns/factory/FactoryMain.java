package com.rtomyj.design.patterns.factory;

import com.rtomyj.design.patterns.factory.abstractfactory.AccountAbstractFactory;
import com.rtomyj.design.patterns.factory.abstractfactory.CheckingAccountAbstractFactory;
import com.rtomyj.design.patterns.factory.abstractfactory.SavingsAccountAbstractFactory;
import com.rtomyj.design.patterns.factory.factory.CheckingAccountFactory;
import com.rtomyj.design.patterns.factory.factory.SavingsAccountFactory;
import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.CoOwner;
import com.rtomyj.design.patterns.factory.simple.SimpleAccountFactory;

public class FactoryMain {

    public static void main(String[] args)
    {

        System.out.println("--------IN FACTORY MAIN METHOD--------");
//        useSimpleFactory();
//        useFactory();
        useAbstractFactory();

    }

    private static void useFactory()
    {

        System.out.println("Using Factory method");
        final Account checkingAccount = new CheckingAccountFactory(100.0, "123456").getAccount();
        printAccountInfo(checkingAccount);
        System.out.println();

        final Account savingsAccount = new SavingsAccountFactory(315.98, "908712", 2.0).getAccount();
        printAccountInfo(savingsAccount);

    }

    private static void useSimpleFactory()
    {

        System.out.println("Using Simple Factory method");
        final Account checkingAccount = SimpleAccountFactory.createAccount(100.0, "123456", null);
        printAccountInfo(checkingAccount);
        System.out.println();

        final Account savingsAccount = SimpleAccountFactory.createAccount(315.98, "908712", 2.0);
        printAccountInfo(savingsAccount);

    }

    private static void useAbstractFactory()
    {

        System.out.println("Using Abstract Factory method");
        final AccountAbstractFactory abstractFactory = new CheckingAccountAbstractFactory(100.0, "908712");
        final Account checkingAccount = abstractFactory.getAccount();
        final CoOwner checkingAccountCoOwner = abstractFactory.getCoOwner();

        printAccountInfo(checkingAccount);
        printCoOwnerInfo(checkingAccountCoOwner);

        System.out.println("--------------");
        final AccountAbstractFactory abstractFactory2 = new SavingsAccountAbstractFactory(315.98, "908712", 2.0);
        final Account savingsAccount = abstractFactory2.getAccount();
        final CoOwner savingsAccountCoOwner = abstractFactory2.getCoOwner();

        printAccountInfo(savingsAccount);
        printCoOwnerInfo(savingsAccountCoOwner);

    }

    private static void printAccountInfo(final Account account)
    {

        System.out.println("Account info: " + account.toString());
        System.out.println("Account status: " + account.getAccountStatus());
        System.out.println("Does account occur interest?: " + account.getAccountStatus());
        System.out.println("The class name is " + account.getClass().toString());

    }


    private static void printCoOwnerInfo(final CoOwner coOwner)
    {

        System.out.println("To string of coOwner" + coOwner.toString());
        System.out.println("The class name is " + coOwner.getClass().toString());

    }

}
