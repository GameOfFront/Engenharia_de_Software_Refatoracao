package org.example;

import org.example.email.EmailSender;
import org.example.invoice.InvoiceGenerator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private List<OrderItem> items;
    private double discountRate = 0.1;
    private EmailSender emailSender;

    public Order(Client client, EmailSender emailSender) {
        this.client = client;
        this.emailSender = emailSender;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getClientName() {
        return client.getName();
    }

    public String getClientEmail() {
        return client.getEmail();
    }

    public double getSubtotal() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    public double getDiscount() {
        return DiscountPolicy.calculateDiscount(getSubtotal(), discountRate);
    }

    public double getTotal() {
        return getSubtotal() - getDiscount();
    }

    public void sendEmail() {
        String message = InvoiceGenerator.generateConfirmationMessage(this);
        emailSender.send(getClientEmail(), message);
    }
}
