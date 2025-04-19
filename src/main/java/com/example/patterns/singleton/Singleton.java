package com.example.patterns.singleton;


public class Singleton {

    private String data;
    private static volatile Singleton instance;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(){

        Singleton result = instance;

        // you can use this result in rest of the part instead of instance variable.
        //so that while returnig instance is not referred anymore

        if(instance == null){
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton("data");
            }
        }
        }
        return instance;

        // instead of accessing instance twice, save instance in a local variable named result
        // and return that only so that while returning main mem access is not taking place.
    }


}
