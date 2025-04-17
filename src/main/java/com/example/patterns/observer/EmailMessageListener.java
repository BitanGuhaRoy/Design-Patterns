package com.example.patterns.observer;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailMessageListener implements EventListener {

    private String email;

    public EmailMessageListener(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification() {
        // send mail
        System.out.println("Sending mail to " + email);
    }
}
