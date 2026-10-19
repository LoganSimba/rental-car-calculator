package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        numberOfDays(scanner);

        //remove the space in the buffer
        scanner.nextLine();

        double tollTag = 1;
        if(electronicTollTag(scanner).equalsIgnoreCase("Yes")){
            tollTag = 3.95;
        }


        // Initializing toll fee, and checking if they want it
        double gpsFee = 1;
        if(gps(scanner).equalsIgnoreCase("Yes")){
            gpsFee = 2.95;
        }

        //Initializing road Side assistance and checking if user needs it to set the price
        double roadSideFee = 1;
        if(roadSideAssistance(scanner).equalsIgnoreCase("Yes")){
            roadSideFee = 3.95;
        }



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



}
