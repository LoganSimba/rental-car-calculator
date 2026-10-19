package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        numberOfDays(scanner);

    }

    //created a method to pask user the days he will rent the car
    public static int numberOfDays(Scanner scanner){
        System.out.printf("How many days will you rent your car: \n");
        return scanner.nextInt();
    }

}
