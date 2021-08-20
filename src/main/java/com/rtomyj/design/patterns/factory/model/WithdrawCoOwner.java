package com.rtomyj.design.patterns.factory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class WithdrawCoOwner extends CoOwner
{

    private int coOwnerWithdrawalLimit;

}
