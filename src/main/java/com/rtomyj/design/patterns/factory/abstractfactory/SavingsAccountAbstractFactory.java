package com.rtomyj.design.patterns.factory.abstractfactory;

import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.WithdrawCoOwner;
import com.rtomyj.design.patterns.factory.model.CoOwner;
import com.rtomyj.design.patterns.factory.model.SavingsAccount;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SavingsAccountAbstractFactory extends AccountAbstractFactory
{

    private final double balance;
    private final String accountNumber;
    private final Double interestRate;


    @Override
    public Account getAccount() {
        return new SavingsAccount(balance, accountNumber, interestRate);
    }


    @Override
    public CoOwner getCoOwner() {
        final WithdrawCoOwner coOwner = new WithdrawCoOwner();
        coOwner.setCoOwnerFirstName("Rebecca");
        coOwner.setCoOwnerLastName("Craven");
        coOwner.setAccountNum(accountNumber);

        coOwner.setCoOwnerWithdrawalLimit(SavingsAccount.MAX_WITHDRAWALS_PER_MONTH / 2);

        return coOwner;
    }

}
