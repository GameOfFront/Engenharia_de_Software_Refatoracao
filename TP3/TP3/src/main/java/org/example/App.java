package org.example;

import org.example.email.EmailSender;
import org.example.email.SimpleEmailService;
import org.example.invoice.InvoicePrinter;

public class App {
    public static void main(String[] args) {
        Product notebook = new Product("Notebook", 3500.0);
        Product mouse = new Product("Mouse", 80.0);

        Client client = new Client("João", "joao@email.com");
        EmailSender emailSender = new SimpleEmailService();

        Order order = new Order(client, emailSender);
        order.addItem(new OrderItem(notebook, 1));
        order.addItem(new OrderItem(mouse, 2));

        InvoicePrinter.print(order);
        order.sendEmail();
    }
}



