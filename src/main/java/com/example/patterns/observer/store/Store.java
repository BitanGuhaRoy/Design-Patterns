package com.example.patterns.observer.store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Store {
    private NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(Events event) {
        notificationService.notifyCustomers(event);
    }

}
