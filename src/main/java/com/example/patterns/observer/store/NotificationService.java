package com.example.patterns.observer.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {

    private final Map<Events, List<EventListener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        for (Events event : Events.values()) {
            customers.put(event, new ArrayList<>());
        }

    }

    public void subscribe(Events event, EventListener eventListener) {

        customers.get(event).add(eventListener);

    }


    public void notifyCustomers(Events event) {
        for (EventListener listener : customers.get(event)) {
            listener.sendNotification();
        }
    }
}
