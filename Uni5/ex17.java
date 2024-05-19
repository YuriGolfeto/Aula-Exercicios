package Uni5;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int highestRegistrationNumber = 0;
        double highestHeight = Double.MIN_VALUE;
        int lowestRegistrationNumber = 0;
        double lowestHeight = Double.MAX_VALUE;
        double totalHeight = 0;
        int numberOfAthletes = 0;

        System.out.println("Enter the registration number and height of each athlete (enter 0 to finish):");

        while (true) {
            System.out.print("Registration number (0 to finish): ");
            int registrationNumber = sc.nextInt();
            if (registrationNumber == 0) {
                break;
            }

            System.out.print("Height (in meters): ");
            double height = sc.nextDouble();

            if (height > highestHeight) {
                highestHeight = height;
                highestRegistrationNumber = registrationNumber;
            }

            if (height < lowestHeight) {
                lowestHeight = height;
                lowestRegistrationNumber = registrationNumber;
            }

            totalHeight += height;
            numberOfAthletes++;
        }

        if (numberOfAthletes > 0) {
            double averageHeight = totalHeight / numberOfAthletes;
            System.out.println("Athlete with the highest height:");
            System.out.println("Registration number: " + highestRegistrationNumber);
            System.out.println("Height: " + highestHeight + " meters");

            System.out.println("Athlete with the lowest height:");
            System.out.println("Registration number: " + lowestRegistrationNumber);
            System.out.println("Height: " + lowestHeight + " meters");

            System.out.println("Average height of the group: " + averageHeight + " meters");
        } else {
            System.out.println("No athlete information provided.");
        }

        sc.close();
    }

}
