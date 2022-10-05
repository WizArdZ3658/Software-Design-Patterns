package org.example;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final List<IConsumer> consumers = new ArrayList<>();

    public void subscribe(IConsumer user) {
        this.consumers.add(user);
    }

    public void notify(String message) {
        for (IConsumer consumer : this.consumers) {
            consumer.notify(message);
        }
    }

    public void unsubscribe(IConsumer user) {
        this.consumers.remove(user);
    }
}
