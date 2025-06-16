package org.example;

public class PriceCalculator_Q3 {

    public double calculatePrice(double basePrice, CustomerType customerType, boolean isHoliday) {
        double baseDiscount = getBaseDiscount(customerType);
        double holidayDiscount = isHoliday ? 0.05 : 0.0;
        double totalDiscount = baseDiscount + holidayDiscount;

        double priceAfterDiscount = basePrice * (1 - totalDiscount);
        return priceAfterDiscount;
    }

    private double getBaseDiscount(CustomerType customerType) {
        switch (customerType) {
            case PREMIUM:
                return 0.10;
            case VIP:
                return 0.15;
            default:
                return 0.0;
        }
    }
}

