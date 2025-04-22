package com.example.patterns.observer.youtube;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<Channel, List<EventListener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        for (Channel channel : Channel.values()) {
            customers.put(channel, new ArrayList<>());
        }
    }

    public void subscribe(Channel channel, EventListener listener) {
        customers.get(channel).add(listener);
    }


    public void notify(Channel channel) {
        for(EventListener listener : customers.get(channel)) {
            listener.sendNotification();
        }
    }

}
