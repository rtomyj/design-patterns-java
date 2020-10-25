package com.rtomyj.design.patterns.prototype;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Prototype implements Cloneable
{

    private String fName, lName;

    private static Map<String, Prototype> cache = new HashMap<>();


    static
    {

        System.out.println("init prototype cache");
        cache.put("Javi", new Prototype("Javi", "Gomez"));
        cache.put("Rebecca", new Prototype("Rebecca", "Craven"));

    }


    public Prototype() {}


    // shallow copy of fields - beware of objects and deep copy when needed
    @Override
    public Prototype clone()
    {

        return new Prototype(this.fName, this.lName);

    }


    // used to return defaults - useful for when certain "base" cases are expected
    public static Prototype getInstance(final String holderKey)
    {

        final Prototype prototype = cache.get(holderKey);

        if (prototype == null)  return new Prototype();
        return prototype.clone();

    }

}
