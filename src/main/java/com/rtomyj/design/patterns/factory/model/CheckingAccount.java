package com.rtomyj.design.patterns.factory.model;


import lombok.ToString;

@ToString(callSuper = true)
public class CheckingAccount extends Account
{

    public CheckingAccount(final double balance, final String accountNumber)
    {

        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    @Override
    public String getAccountStatus()
    {

        return String.format("Account %s has balance %.2f. This account doesn't have limits on withdrawals", accountNumber, balance);

    }

    @Override
    boolean accruesInterest() { return false; }

}
