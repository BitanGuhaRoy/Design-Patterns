package com.example.patterns.observer.store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextMessageListener implements EventListener {

    private String number;

    public TextMessageListener(String number) {
        this.number = number;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending text to " + number);
    }


}
