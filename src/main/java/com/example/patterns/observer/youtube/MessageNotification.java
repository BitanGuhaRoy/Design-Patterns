package com.example.patterns.observer.youtube;

public class MessageNotification implements EventListener {
    String name;
    public MessageNotification(String name) {
        this.name = name;
    }

    @Override
    public void sendNotification() {
        System.out.println("Message notification " + name);
    }
}
