package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        double basePrice = 29.99;





        int days = numberOfDays(scanner);
        scanner.nextLine();
        String tolls = electronicTollTag(scanner);


        String gpsChoice = gps(scanner);
        String roadSide = roadSideAssistance(scanner);


        // stored the method to find optional cost in a variable and printed it
        double optional = optionalCost(tolls, gpsChoice, roadSide, days);
        System.out.printf("Your optional package is $%.2f for %d days", optional, days);



    }

    // method to ask user what day they want to pick up their carf
    public static String pickupDate(Scanner scanner){
        System.out.println("What day you want to pick the car up: ");
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
        System.out.print("Would you like road side assistance: ");
        return scanner.nextLine();

    }

    // method to ask user their age
    public static int age(Scanner scanner) {

        System.out.print("What is your age: ");
        return scanner.nextInt();
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

    }
