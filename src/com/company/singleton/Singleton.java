package com.company.singleton;

public class Singleton {
    private static final Singleton sInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return sInstance;
    }
}
