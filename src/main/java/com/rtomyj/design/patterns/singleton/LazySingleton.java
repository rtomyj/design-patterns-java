package com.rtomyj.design.patterns.singleton;


public class LazySingleton {

    private static LazySingleton lazySingleton;


    private LazySingleton()
    {

        System.out.println("lazy singleton has been initialized");

    }


    // faster implementation while still being thread safe. Since synchronized block is run only when singleton is null (pre init) perf hits are only seen at the start.
    public static LazySingleton getInstance()
    {

        if (lazySingleton == null)
        {
            synchronized (LazySingleton.class)  // thread safe
            {
                if (lazySingleton == null) lazySingleton = new LazySingleton();
            }
        }

        return lazySingleton;

    }


    // slower than above method since whole method is synchronized and only ONE thread can call it at one time.
    public synchronized static LazySingleton synchronizedGetInstance()
    {

        if (lazySingleton == null)  lazySingleton =  new LazySingleton();

        return lazySingleton;

    }

}
