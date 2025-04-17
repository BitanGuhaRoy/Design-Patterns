package com.example.patterns.observer;


import java.util.ArrayList;
import java.util.List;

public class Client {
    // Notifies multiple objects or subscribers about any events that happen to the object they are observing
    // or publisher
    // Behavioral design pattern
    public static void main(String[] args) {
//        EventListener emailMessageListener = new EmailMessageListener("bitanguharoy@gmail.com");
//        EventListener emailMessageListener2 = new EmailMessageListener("dibyenduguharoy@gmail.com");
//        List<EventListener> messageListeners = new ArrayList<>();
//        messageListeners.add(emailMessageListener);
//        messageListeners.add(emailMessageListener2);
//
//        EventListener eventListener = new TextMessageListener("7044654415");
//        messageListeners.add(eventListener);
//
//        NotificationService notificationService = new NotificationService(messageListeners);
//        Store store = new Store(notificationService);
//        store.sendNotification();

        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(Events.SALE, new EmailMessageListener("Bitanguharoy@gmail.com"));
        notificationService.subscribe(Events.NEW_ITEM, new TextMessageListener("7044654415"));
        notificationService.subscribe(Events.NEW_ITEM, new EmailMessageListener("dibyenduguharoy@gmail.com"));
        Store store = new Store(notificationService);
        store.sendNotification(Events.SALE);
    }
}
