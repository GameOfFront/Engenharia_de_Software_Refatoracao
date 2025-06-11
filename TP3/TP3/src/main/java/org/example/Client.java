package org.example;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email do cliente não pode ser vazio.");
        }
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}


