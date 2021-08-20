package com.rtomyj.design.patterns.factory.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SavingsAccount extends Account
{

    public static final int MAX_WITHDRAWALS_PER_MONTH = 6;

    private final  double interestRate;

    public SavingsAccount(final double balance, final String accountNumber, final double interestRate)
    {

        this.balance = balance;
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;

    }

    @Override
    public String getAccountStatus()
    {
        return String.format("Account %s has balance %.2f. This account only has %d withdrawals per month.", accountNumber, balance, MAX_WITHDRAWALS_PER_MONTH);

    }


    @Override
    boolean accruesInterest() {
        return true;
    }

}
