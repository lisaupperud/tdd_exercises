package com.liluppis.tdd_exercises.dry;

public class Discount {

    private double totalBeforeDiscount;
    private double discount;
    private double discountAmount;
    private double totalAfterDiscount;

    public Discount(double totalBeforeDiscount, double discount, double discountAmount, double totalAfterDiscount) {
        this.totalBeforeDiscount = totalBeforeDiscount;
        this.discount = discount;
        this.discountAmount = discountAmount;
        this.totalAfterDiscount = totalAfterDiscount;
    }



    private double calculatePriceBeforeDiscount(double a, int b) {
     return totalBeforeDiscount = a + b;
    }

    private double calculateTotalAfterDiscount(double a, int b) {
        return discountAmount = totalAfterDiscount * (discount / 100);
    }


}
