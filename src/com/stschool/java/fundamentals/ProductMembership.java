package com.stschool.java.fundamentals;

import java.util.Scanner;

public class ProductMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Price : ");
        int productPrice = sc.nextInt();

        System.out.print("Enter Discount Membership Type : ");
        char membershipType = sc.next().charAt(0);

        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        double totalAmount, discountedPrice, totalSavedAmount, discountAmount, stateTax, centralTax, finalProductPrice;
        short shippingCharges;
        float discountPercentage;

        if(membershipType == 'S')  {
            discountPercentage = 10;
            shippingCharges = 50;
        } else if(membershipType == 'G') {
            discountPercentage = 15;
            shippingCharges = 20;
        } else if(membershipType == 'D'){
            discountPercentage = 20;
            shippingCharges = 0;
        } else {
            discountPercentage = 0;
            shippingCharges = 100;
        }

        discountAmount = productPrice * (discountPercentage / 100);
        discountedPrice = productPrice - discountAmount;

        stateTax = discountedPrice * (STATE_TAX_PERCENTAGE/100);
        centralTax = discountedPrice * (CENTRAL_TAX_PERCENTAGE/100);

        finalProductPrice = discountedPrice + stateTax + centralTax;

        System.out.println("Product price : " + productPrice);
        System.out.println("Discount Percentage : " + discountPercentage + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Discounted Price : " + discountedPrice);
        System.out.println("State Tax : " + stateTax);
        System.out.println("Central Tax : " + centralTax);
        System.out.println("Product price : " + finalProductPrice);
        System.out.println("Shipping Charges : " + shippingCharges);

        System.out.print("Enter Product Quantity : ");
        int productQuantity = sc.nextInt();

        totalSavedAmount = (productQuantity * discountAmount);
        totalAmount = finalProductPrice * productQuantity + shippingCharges;

        System.out.println("Total Saved Amount : " + totalSavedAmount);
        System.out.println("Total Amount : " + totalAmount);


        sc.close();
    }
}
