package com.rtomyj.design.patterns.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {

        final List<TitleInformation> titleInformation = getTitles();
        final List<Employee> employees = getEmployees();

        final double bumpAmount = 5000;

        System.out.println("Determining new salary for employee when bump increase is " + bumpAmount);
        final SalaryBumpIterable salaryBumpIterable = new SalaryBumpIterable(employees, titleInformation, bumpAmount);

        for (String s : salaryBumpIterable) System.out.println(s);

    }


    private static List<TitleInformation> getTitles()
    {

        final TitleInformation juniorDev = TitleInformation.builder().title(Title.JUNIOR_DEVELOPER).nextTitle(Title.DEVELOPER).salaryCap(76000).build();
        final TitleInformation developer = TitleInformation.builder().title(Title.DEVELOPER).nextTitle(Title.SENIOR_DEVELOPER).salaryCap(115000).build();
        final TitleInformation seniorDeveloper = TitleInformation.builder().title(Title.SENIOR_DEVELOPER).nextTitle(null).salaryCap(-1).build();

        return Arrays.asList(juniorDev, developer, seniorDeveloper);

    }


    private static List<Employee> getEmployees()
    {

        final Employee homer = Employee.builder().name("Homer").title(Title.JUNIOR_DEVELOPER).currentSalary(52000).build();
        final Employee bart = Employee.builder().name("Bart").title(Title.DEVELOPER).currentSalary(116000).build();
        final Employee lisa = Employee.builder().name("Lisa").title(Title.DEVELOPER).currentSalary(105000).build();
        final Employee marge = Employee.builder().name("Marge").title(Title.DEVELOPER).currentSalary(113000).build();
        final Employee maggie = Employee.builder().name("Maggie").title(Title.SENIOR_DEVELOPER).currentSalary(151000).build();

        return Arrays.asList(homer, bart, lisa, marge, maggie);

    }


}
