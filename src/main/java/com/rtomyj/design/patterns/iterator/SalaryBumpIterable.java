package com.rtomyj.design.patterns.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public final class SalaryBumpIterable implements Iterable<String>
{

    private final List<Employee> employees;
    private final  List<TitleInformation> titleInformation;
    private final double salaryBumpAmount;


    public SalaryBumpIterable(final List<Employee> employees, final List<TitleInformation> titleInformation, final double salaryBumpAmount)
    {

        this.employees = employees;
        this.titleInformation = titleInformation;
        this.salaryBumpAmount = salaryBumpAmount;

    }

    @Override
    public SalaryBumpIterator<String> iterator() {
        return new SalaryBumpIterator(employees.size());
    }


    private final class SalaryBumpIterator<S> implements Iterator<String>
    {

        private final int employeeNum;
        private int iteration;


        private SalaryBumpIterator(final int employeeNum)
        {
            this.employeeNum = employeeNum;
        }

        @Override
        public boolean hasNext() {
            return iteration < employeeNum;
        }

        @Override
        public String next() {

            final Employee employee = employees.get(iteration);
            final double newSalary = salaryBumpAmount + employee.getCurrentSalary();
            final double salaryCap = getSalaryCap(employee.getTitle());

            iteration++;
            if (salaryCap != -1 && newSalary > salaryCap)  return employee.getName() + " cannot receive salary bump since they will exceed cap.";
            else
            {
                return employee.getName() + " will receive bump and have a new salary of " + newSalary;
            }

        }

        private double getSalaryCap(final Title title)
        {

            final Optional<TitleInformation> t = titleInformation
                    .stream()
                    .filter(info -> info.getTitle().equals(title))
                    .findFirst();

           return (t.isPresent())? t.get().getSalaryCap() : 0;
        }
    }

}
