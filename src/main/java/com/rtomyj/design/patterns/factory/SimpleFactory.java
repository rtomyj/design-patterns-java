package com.rtomyj.design.patterns.factory;

public final class SimpleFactory
{

    public static Account createAccount(final boolean accruesInterest, final double balance, final String accountNumber)
    {

        if (accruesInterest)    return new SavingsAccount(balance, accountNumber);
        return new CheckingAccount(balance, accountNumber);

    }

}
