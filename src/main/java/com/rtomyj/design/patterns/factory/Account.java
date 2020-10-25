package com.rtomyj.design.patterns.factory;

import lombok.ToString;

@ToString
public abstract class Account
{

    double balance;
    String accountNumber;


    abstract String getAccountStatus();

    abstract boolean accruesInterest();

}
