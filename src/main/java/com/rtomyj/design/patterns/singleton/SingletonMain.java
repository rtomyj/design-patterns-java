package com.rtomyj.design.patterns.singleton;

public class SingletonMain
{

    public static void main(String[] args) throws Exception
    {

        System.out.println("ENTERING METHOD");
        for (int i = 0; i < 10000; i++)
        {
            if (i % 100 == 0)
                System.out.println("doing work");
        }

        Thread.sleep(5000);
        System.out.println("THIS COMMENT IS PRINTED BEFORE GETTING SINGLETON INSTANCE");
        eager();
        lazy();

    }


    public static void eager()
    {

       final EagerSingleton eagerSingleton = EagerSingleton.getInstance();
       final EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

    }


    public static void lazy()
    {

        final LazySingleton lazySingleton = LazySingleton.getInstance();
        final LazySingleton lazySingleton1 = LazySingleton.synchronizedGetInstance();

    }

}
