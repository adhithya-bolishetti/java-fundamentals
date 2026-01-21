package com.stschool.java.fundamentals;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args0) {

        Scanner sc = new Scanner(System.in);

        byte shirtSize, batteryPercentage, noOfTyres, replacementDays, discountPercentage;

        System.out.print("Enter shirt size : ");
        shirtSize = sc.nextByte();

        System.out.print("Enter battery percentage : ");
        batteryPercentage = sc.nextByte();

        System.out.print("Enter number of tyres : ");
        noOfTyres = sc.nextByte();

        System.out.print("Enter replacement days : ");
        replacementDays = sc.nextByte();

        System.out.print("Enter discount percentage : ");
        discountPercentage = sc.nextByte();

        System.out.println("Shirt size : " + shirtSize);
        System.out.println("Battery percentage : " + batteryPercentage);
        System.out.println("Number of tyres : " + noOfTyres);
        System.out.println("Replacement days : " + replacementDays);
        System.out.println("Discount percentage : " + discountPercentage);

        short marks, bookPages, memorySize, batterySize, stockAvailability;

        System.out.print("Enter marks : ");
        marks = sc.nextShort();

        System.out.print("Enter book pages : ");
        bookPages = sc.nextShort();

        System.out.print("Enter memory size : ");
        memorySize = sc.nextShort();

        System.out.print("Enter battery size : ");
        batterySize = sc.nextShort();

        System.out.print("Enter stock availability : ");
        stockAvailability = sc.nextShort();

        System.out.println("Marks : " + marks);
        System.out.println("Book pages : " + bookPages);
        System.out.println("Memory size : " + memorySize);
        System.out.println("Battery size : " + batterySize);
        System.out.println("Stock availability : " + stockAvailability);

        int reviewCount, price, exchangeValue, kilometers, rank;

        System.out.print("Enter review count : ");
        reviewCount = sc.nextInt();

        System.out.print("Enter price : ");
        price = sc.nextInt();

        System.out.print("Enter exchange value : ");
        exchangeValue = sc.nextInt();

        System.out.print("Enter kilometers : ");
        kilometers = sc.nextInt();

        System.out.print("Enter rank : ");
        rank = sc.nextInt();

        System.out.println("Review count : " + reviewCount);
        System.out.println("Price : " + price);
        System.out.println("Exchange value : " + exchangeValue);
        System.out.println("Kilometers : " + kilometers);
        System.out.println("Rank : " + rank);

        long mobileNumber, aadhaarNumber, accountNumber, population, netWorth;

        System.out.print("Enter mobile number : ");
        mobileNumber = sc.nextLong();

        System.out.print("Enter Aadhaar number : ");
        aadhaarNumber = sc.nextLong();

        System.out.print("Enter account number : ");
        accountNumber = sc.nextLong();

        System.out.print("Enter population : ");
        population = sc.nextLong();

        System.out.print("Enter net worth : ");
        netWorth = sc.nextLong();

        System.out.println("Mobile number : " + mobileNumber);
        System.out.println("Aadhaar number : " + aadhaarNumber);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Population : " + population);
        System.out.println("Net worth : " + netWorth);

        float rating, uiVersion, displaySize, engineTemperature, bluetoothVersion;

        System.out.print("Enter rating : ");
        rating = sc.nextFloat();

        System.out.print("Enter UI version : ");
        uiVersion = sc.nextFloat();

        System.out.print("Enter display size : ");
        displaySize = sc.nextFloat();

        System.out.print("Enter engine temperature : ");
        engineTemperature = sc.nextFloat();

        System.out.print("Enter Bluetooth version : ");
        bluetoothVersion = sc.nextFloat();

        System.out.println("Rating : " + rating);
        System.out.println("UI version : " + uiVersion);
        System.out.println("Display size : " + displaySize);
        System.out.println("Engine temperature : " + engineTemperature);
        System.out.println("Bluetooth version : " + bluetoothVersion);

        double coordinates, piValue, bloodSugarLevel, networkLatency, executionTime;

        System.out.print("Enter coordinates : ");
        coordinates = sc.nextDouble();

        System.out.print("Enter pi value : ");
        piValue = sc.nextDouble();

        System.out.print("Enter blood sugar level : ");
        bloodSugarLevel = sc.nextDouble();

        System.out.print("Enter network latency : ");
        networkLatency = sc.nextDouble();

        System.out.print("Enter execution time : ");
        executionTime = sc.nextDouble();

        System.out.println("Coordinates : " + coordinates);
        System.out.println("Pi value : " + piValue);
        System.out.println("Blood sugar level : " + bloodSugarLevel);
        System.out.println("Network latency : " + networkLatency);
        System.out.println("Execution time : " + executionTime);

        sc.close();
    }
}
