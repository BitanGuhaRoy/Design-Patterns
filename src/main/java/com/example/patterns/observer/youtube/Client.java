package com.example.patterns.observer.youtube;

public class Client {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(Channel.NDTV, new GmailNotification("bitan"));
        notificationService.subscribe(Channel.AAJ_TAAk, new MessageNotification("sarmi"));
        YouTube youTube = new YouTube(notificationService);
        youTube.sendNotification(Channel.AAJ_TAAk);

    }
}
