package com.rtomyj.design.patterns.prototype;


public class PrototypeMain
{

    public static void main(String[] args)
    {

        final Prototype javi = Prototype.getInstance("Javi");
        final Prototype rebecca = Prototype.getInstance("Rebecca");
        final Prototype lupe = Prototype.getInstance("Lupe");

        final Prototype javi2 = Prototype.getInstance("Javi");

        System.out.println(javi);
        System.out.println(rebecca);
        System.out.println(lupe);

        System.out.println("Is javi == javi2? " + (javi == javi2) );

    }

}
