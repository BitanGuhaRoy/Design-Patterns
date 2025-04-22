package com.example.patterns.observer.youtube;

public class GmailNotification implements EventListener {
    String name;

    public GmailNotification(String name) {
        this.name = name;
    }
    @Override
    public void sendNotification() {
        System.out.println("Gmail notification " + name);
    }
}
