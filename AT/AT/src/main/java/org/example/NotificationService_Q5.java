package org.example;

import java.util.HashMap;
import java.util.Map;

public class NotificationService_Q5 {
    private final Map<String, NotificationChannel_Q5> channels = new HashMap<>();

    public NotificationService_Q5() {
        channels.put("EMAIL", new EmailChannel_Q5());
        channels.put("SMS", new SmsChannel_Q5());
        channels.put("PUSH", new PushChannel_Q5());
    }

    public void notifyUser(String channel, String message) {
        NotificationChannel_Q5 notificationChannel = channels.get(channel);
        if (notificationChannel != null) {
            notificationChannel.send(message);
        } else {
            throw new IllegalArgumentException("Canal não suportado: " + channel);
        }
    }
}

