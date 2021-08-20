package com.rtomyj.design.patterns.iterator;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class TitleInformation {

    private Title title;
    private Title nextTitle;
    private double salaryCap;

}
