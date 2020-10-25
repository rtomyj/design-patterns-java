package com.rtomyj.design.patterns.factory;

import lombok.ToString;

@ToString(callSuper = true)
public class SavingsAccount extends Account
{

    private static final int MAX_WITHDRAWALS_PER_MONTH = 6;

    public SavingsAccount(final double balance, final String accountNumber)
    {

        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    @Override
    String getAccountStatus()
    {
        return String.format("Account %s has balance %.2f. This account only has %d withdrawals per month.", accountNumber, balance, MAX_WITHDRAWALS_PER_MONTH);

    }


    @Override
    boolean accruesInterest() {
        return true;
    }

}
