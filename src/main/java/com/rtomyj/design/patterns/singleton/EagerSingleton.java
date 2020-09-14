package com.rtomyj.design.patterns.singleton;

public class EagerSingleton
{

    private static final EagerSingleton eagerSingleton = new EagerSingleton();


    public static EagerSingleton getInstance()
    {
        return eagerSingleton;
    }


    private EagerSingleton()
    {

        System.out.println("Eager singleton created!!!!!");

    }

}
