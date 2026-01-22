package com.stschool.java.fundamentals;

import java.util.Scanner;

public class ProductBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Price : ");
        int productPrice = sc.nextInt();

        System.out.print("Enter Discount Percentage : ");
        float discountPercentage = sc.nextFloat();

        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        double totalAmount, discountedPrice, totalSavedAmount, discountAmount, stateTax, centralTax, finalProductPrice;

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

        System.out.print("Enter Product Quantity : ");
        int productQuantity = sc.nextInt();

        totalSavedAmount = (productQuantity * discountAmount);
        totalAmount = finalProductPrice * productQuantity;

        System.out.println("Total Saved Amount : " + totalSavedAmount);
        System.out.println("Total Amount : " + totalAmount);


        sc.close();
    }
}
