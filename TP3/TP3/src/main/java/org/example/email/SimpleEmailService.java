package org.example.email;

public class SimpleEmailService implements EmailSender {
    @Override
    public void send(String to, String message) {
        System.out.println("Enviando e-mail para " + to + ": " + message);
    }
}

