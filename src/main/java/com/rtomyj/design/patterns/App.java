package com.rtomyj.design.patterns;

import com.rtomyj.design.patterns.singleton.EagerSingleton;

public class App
{

    public static void main(String[] args)
    {

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

    }

}