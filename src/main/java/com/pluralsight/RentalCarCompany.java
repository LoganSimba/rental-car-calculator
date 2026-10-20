package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        double basePrice = 29.99;



        //remove the space in the buffer
        scanner.nextLine();

        String Tolls = electronicTollTag(scanner);
        String gpsChoice = gps(scanner);
        String roadSide = roadSideAssistance(scanner);







    }

    // method to ask user what day they want to pick up their carf
    public static String pickupDate(Scanner scanner){
        System.out.println("What day you want to pick the car up: ");
        return scanner.nextLine();
    }




    //created a method to pask user the days he will rent the car
    public static int numberOfDays(Scanner scanner){
        System.out.printf("How many days will you rent your car: \n");
        return scanner.nextInt();
    }

    // method to ask user for a toll tag
    public static String electronicTollTag(Scanner scanner){
        System.out.println("Do you want an electronic toll tag at $3.95/day");
        return scanner.nextLine();

    }

    // method to ask user if they want a gps
    public static String gps(Scanner scanner){
        System.out.println("Would you like a GPS (Yes/NO): ");
        return scanner.nextLine();
    }

    //method to ask user if they want the road side assistance
    public static String roadSideAssistance(Scanner scanner){
        System.out.println("Would you like road side assistance: ");
        return scanner.nextLine();

    }

    // method to ask user their age
    public static int age(Scanner scanner) {

        System.out.println("What is your age: ");
        return scanner.nextInt();
    }


    public static double voidtotalCost(){


    }

    }
