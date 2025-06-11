package org.example;

public class Product {
    private String name;
    private double unitPrice;

    public Product(String name, double unitPrice) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        }
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Preço do produto deve ser positivo.");
        }
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}


