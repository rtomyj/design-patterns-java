package com.rtomyj.design.patterns.factory.factory;

import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.SavingsAccount;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SavingsAccountFactory implements AccountFactory
{

    private final double balance;
    private final String accountNumber;
    private final Double interestRate;

    @Override
    public Account getAccount() {
        return new SavingsAccount(balance, accountNumber, interestRate);
    }

}
