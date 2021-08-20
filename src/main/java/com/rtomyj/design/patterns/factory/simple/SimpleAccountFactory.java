package com.rtomyj.design.patterns.factory.simple;

import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.CheckingAccount;
import com.rtomyj.design.patterns.factory.model.SavingsAccount;

public final class SimpleAccountFactory
{

    public static Account createAccount(final double balance, final String accountNumber, final Double interestRate)
    {

        if (interestRate != null)    return new SavingsAccount(balance, accountNumber, interestRate);
        return new CheckingAccount(balance, accountNumber);

    }

}
