package org.example;

public class SmsChannel_Q5 implements NotificationChannel_Q5 {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
