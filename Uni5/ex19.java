package Uni5;

import java.util.Scanner;

public class ex19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalRevenue = 0;

        while (true) {
            System.out.print("Enter the purchase amount (enter 0 to finish): ");
            double purchaseAmount = sc.nextDouble();

            if (purchaseAmount == 0) {
                break;
            }

            double discount = 0;
            if (purchaseAmount > 500) {
                discount = 0.2 * purchaseAmount;
            } else {
                discount = 0.15 * purchaseAmount;
            }

            double totalToPay = purchaseAmount - discount;
            totalRevenue += totalToPay;

            System.out.println("Total to pay: " + totalToPay);
        }

        System.out.println("Total revenue for the day: " + totalRevenue);

        sc.close();
    }
    
}