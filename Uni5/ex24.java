package Uni5;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the daily weight limit (in kilograms): ");
        double dailyLimit = sc.nextDouble() * 1000; // Convert kilograms to grams

        double totalWeight = 0;
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter the weight of the fish (in grams): ");
            double fishWeight = sc.nextDouble();
            totalWeight += fishWeight;

            if (totalWeight > dailyLimit) {
                System.out.println("Daily weight limit exceeded! Fishing is over.");
                break;
            }

            System.out.println("Total weight of the catch so far: " + totalWeight + " grams");

            sc.nextLine(); // Consume the newline character

            System.out.println("Do you want to enter the weight of another fish? (y / n)");
            String choice = sc.nextLine().toLowerCase();
            continueInput = choice.toLowerCase().equals("y");
        }

        sc.close();
    }
}
