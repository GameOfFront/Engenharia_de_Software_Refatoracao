package org.example;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public String getProductName() {
        return product.getName();
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return product.getUnitPrice();
    }

    public double getTotalPrice() {
        return product.getUnitPrice() * quantity;
    }
}

