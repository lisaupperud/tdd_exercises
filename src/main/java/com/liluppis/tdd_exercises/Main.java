package com.liluppis.tdd_exercises;

public class Main {



    // Prices before discount
    double item1Total = item1Price * item1Quantity;
    double item2Total = item2Price * item2Quantity;
    double totalBeforeDiscount = item1Total + item2Total;
    System.out.println("Total before discount: $" + totalBeforeDiscount);



    // Discount
    double discount = 10.0;
    double discountAmount = totalBeforeDiscount * (discount / 100);
    double totalAfterDiscount = totalBeforeDiscount - discountAmount;
    System.out.println("Discount: $" + discountAmount);
    System.out.println("Total after discount: $" + totalAfterDiscount);


    // Another method of calculating total for the same items
    double anotherItem1Total = item1Price * item1Quantity;
    double anotherItem2Total = item2Price * item2Quantity;
    double anotherTotalBeforeDiscount = anotherItem1Total + anotherItem2Total;
    double anotherDiscountAmount = anotherTotalBeforeDiscount * (discount / 100);
    double anotherTotalAfterDiscount = anotherTotalBeforeDiscount - anotherDiscountAmount;
    System.out.println("Another total before discount: $" + anotherTotalBeforeDiscount);
    System.out.println("Another total after discount: $" + anotherTotalAfterDiscount)


}
