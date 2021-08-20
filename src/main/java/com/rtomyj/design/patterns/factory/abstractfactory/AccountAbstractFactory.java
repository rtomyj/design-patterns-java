package com.rtomyj.design.patterns.factory.abstractfactory;

import com.rtomyj.design.patterns.factory.model.Account;
import com.rtomyj.design.patterns.factory.model.CoOwner;

public abstract class AccountAbstractFactory
{

    public abstract Account getAccount();

    public abstract CoOwner getCoOwner();

}
