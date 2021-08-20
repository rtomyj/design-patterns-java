package com.rtomyj.design.patterns.factory.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public abstract class CoOwner
{

    String coOwnerFirstName;
    String coOwnerLastName;
    String accountNum;

}
