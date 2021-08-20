package com.rtomyj.design.patterns.factory.abstractfactory;

import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.WithdrawCoOwner;
import com.rtomyj.design.patterns.factory.model.CheckingAccount;
import com.rtomyj.design.patterns.factory.model.CoOwner;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CheckingAccountAbstractFactory extends AccountAbstractFactory
{

    private final double balance;
    private final String accountNumber;


    @Override
    public Account getAccount() {
        return new CheckingAccount(balance, accountNumber);
    }


    @Override
    public CoOwner getCoOwner() {
        final CoOwner coOwner = new WithdrawCoOwner();
        coOwner.setCoOwnerFirstName("Rebecca");
        coOwner.setCoOwnerLastName("Craven");
        coOwner.setAccountNum(accountNumber);

        return coOwner;
    }

}
