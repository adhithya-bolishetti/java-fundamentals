package com.stschool.java.fundamentals;

import java.util.Scanner;

public class ProductShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        int availableStock = 100;
        char continueShopping = 'Y';

        do {
            if (availableStock == 0) {
                System.out.println("Stock not available");
                break;
            }
            System.out.println("Welcome to E-Commerce Website");
            System.out.println("1. Products");
            System.out.println("2. Exit");

            System.out.println("Enter you choice");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Welcome to Products Section");
                    System.out.println("Enter Product Price");
                    int productPrice = sc.nextInt();

                    System.out.print("Enter Discount Membership Type : ");
                    char membershipType = sc.next().charAt(0);

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

                    if (availableStock < productQuantity) {
                        System.out.println("Please enter Quantity less than or equal to " + availableStock);
                        productQuantity = sc.nextInt();
                    }

                    totalSavedAmount = (productQuantity * discountAmount);
                    totalAmount = finalProductPrice * productQuantity + shippingCharges;
                    availableStock -= productQuantity;

                    System.out.println("Total Saved Amount : " + totalSavedAmount);
                    System.out.println("Total Amount : " + totalAmount);

                    System.out.println("Thanks for shopping");
                    System.out.println("Continue Shopping (Y/N)");
                    continueShopping = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("Thanks for Shopping");
                    continueShopping = 'N';
                    break;
                default:
                    System.out.println("Enter proper input");
            }
        } while (continueShopping == 'Y');

        sc.close();
    }
}
