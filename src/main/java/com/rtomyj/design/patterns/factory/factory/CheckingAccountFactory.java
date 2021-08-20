package com.rtomyj.design.patterns.factory.factory;

import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.CheckingAccount;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class CheckingAccountFactory implements AccountFactory {

    private final double balance;
    private final String accountNumber;

    @Override
    public Account getAccount() {
        return new CheckingAccount(balance, accountNumber);
    }

}
