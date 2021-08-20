package com.rtomyj.design.patterns.iterator;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Employee {

    private String name;
    private Title title;
    private double currentSalary;

}
