package org.example;

public class EmailChannel_Q5 implements NotificationChannel_Q5 {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

