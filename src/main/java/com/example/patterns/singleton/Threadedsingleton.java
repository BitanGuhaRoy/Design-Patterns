package com.example.patterns.singleton;

public class Threadedsingleton implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();


        singleton = Singleton.getInstance();

        System.out.println("Object data is "+ singleton.toString()+ "Printed by "+ Thread.currentThread().getName());

    }
}
