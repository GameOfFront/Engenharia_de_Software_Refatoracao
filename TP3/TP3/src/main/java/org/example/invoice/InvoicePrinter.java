package org.example.invoice;

import org.example.Order;
import org.example.OrderItem;

public class InvoicePrinter {

    public static void print(Order order) {
        System.out.println("Cliente: " + order.getClientName());

        printItems(order);
        printSummary(order);
    }

    private static void printItems(Order order) {
        for (OrderItem item : order.getItems()) {
            printItemLine(item);
        }
    }

    private static void printItemLine(OrderItem item) {
        System.out.println(item.getQuantity() + "x " +
                item.getProductName() + " - R$" + item.getUnitPrice());
    }

    private static void printSummary(Order order) {
        System.out.println("Subtotal: R$" + order.getSubtotal());
        System.out.println("Desconto: R$" + order.getDiscount());
        System.out.println("Total final: R$" + order.getTotal());
    }
}


