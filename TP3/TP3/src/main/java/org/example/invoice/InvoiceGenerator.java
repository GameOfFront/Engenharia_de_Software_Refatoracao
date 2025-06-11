package org.example.invoice;

import org.example.Order;

public class InvoiceGenerator {
    public static String generateConfirmationMessage(Order order) {
        return "Pedido recebido! Obrigado pela compra, " + order.getClientName() + ".";
    }
}

