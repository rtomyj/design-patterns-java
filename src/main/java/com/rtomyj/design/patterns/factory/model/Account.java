package com.rtomyj.design.patterns.factory.model;

import lombok.ToString;

@ToString
public abstract class Account
{

    double balance;
    String accountNumber;


    public abstract String getAccountStatus();

    abstract boolean accruesInterest();

}
