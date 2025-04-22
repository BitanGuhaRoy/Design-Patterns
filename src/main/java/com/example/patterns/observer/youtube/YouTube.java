package com.example.patterns.observer.youtube;

public class YouTube {
    private NotificationService notificationService;

    public YouTube(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotification(Channel channel) {
        notificationService.notify(channel);
    }
}
