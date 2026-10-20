package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        double basePrice = 29.99;


        // Created variables to store what the methods returned
        String pickup = pickupDate(scanner);
        int days = numberOfDays(scanner);
        scanner.nextLine();

        String tolls = electronicTollTag(scanner);
        String gpsChoice = gps(scanner);
        String roadSide = roadSideAssistance(scanner);
        int userAge = age(scanner);


        // stored the method to find optional cost in a variable and printed it
        double optional = optionalCost(tolls, gpsChoice, roadSide, days);

        // calculate costs
        double basicRental = basePrice * days;
        double surcharge = underageSurcharge(userAge, basicRental);
        double total = basicRental + optional + surcharge;

        //call the receipt method and print it
        printReceipt(pickup, basicRental, optional, surcharge, total);

        scanner.close();
    }

    // method to ask user what day they want to pick up their carf
    public static String pickupDate(Scanner scanner){
        System.out.print("When day you want to pick the car up (Monday-Friday): ");
        return scanner.nextLine();
    }


    //created a method to pask user the days he will rent the car
    public static int numberOfDays(Scanner scanner){
        System.out.print("How many days will you rent your car: ");
        return scanner.nextInt();
    }

    // method to ask user for a toll tag
    public static String electronicTollTag(Scanner scanner){
        System.out.print("Do you want an electronic toll tag at $3.95/day (Yes/No): ");
        return scanner.nextLine();

    }

    // method to ask user if they want a gps
    public static String gps(Scanner scanner){
        System.out.print("Would you like a GPS (Yes/NO): ");
        return scanner.nextLine();
    }

    //method to ask user if they want the road side assistance
    public static String roadSideAssistance(Scanner scanner){
        System.out.print("Would you like road side assistance(Yes/no): ");
        return scanner.nextLine();
    }

    // method to ask user their age
    public static int age(Scanner scanner) {

        System.out.print("What is your age: ");
        return scanner.nextInt();
    }



    // method to calculate the 30% surcharge for drivers under 25
    public static double underageSurcharge(int age, double basicRental) {
        if (age < 25) {
            return basicRental * 0.30;
        }
        return 0;
    }


    //Added a method to calculate daily cost of the optional packages
    public static double optionalCost(String toll, String gpsChoice, String roadSide, int days){
        double dailyCost = 0.0;

        if(toll.equalsIgnoreCase("yes")){
            dailyCost += 3.95;
        }

        if(gpsChoice.equalsIgnoreCase("yes")){
            dailyCost += 2.95;
        }

        if(roadSide.equalsIgnoreCase("yes")){
            dailyCost += 3.95;
        }

        return dailyCost * days;

    }


    // added method to print receipt
    public static void printReceipt(String pickup, double basicRental, double optional,
                                    double surcharge, double total) {
        System.out.println("\n----- Rental Summary -----");
        System.out.printf("Pickup date: %s%n", pickup);
        System.out.printf("Basic car rental: $%.2f%n", basicRental);
        System.out.printf("Options: $%.2f%n", optional);
        System.out.printf("Underage surcharge: $%.2f%n", surcharge);
        System.out.printf("Total cost: $%.2f%n", total);
    }



    }
