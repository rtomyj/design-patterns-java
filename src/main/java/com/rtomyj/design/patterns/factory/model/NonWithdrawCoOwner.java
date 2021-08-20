package com.rtomyj.design.patterns.factory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString(callSuper = true)
public class NonWithdrawCoOwner extends CoOwner
{

    private final int coOwnerWithdrawalLimit = 0;

}
