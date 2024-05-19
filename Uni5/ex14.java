package Uni5;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        final int totalItems = 20;
        String[] itemNames = new String[totalItems];
        double[] purchasePrices = new double[totalItems];
        double[] sellingPrices = new double[totalItems];

        int countLessThan10 = 0;
        int countBetween10And20 = 0;
        int countGreaterThan20 = 0;
        double totalPurchaseValue = 0;
        double totalSellingValue = 0;
        double totalProfit = 0;

        for (int i = 0; i < totalItems; i++) {
            System.out.println("Enter the name of item " + (i + 1) + ":");
            itemNames[i] = sc.nextLine();

            System.out.println("Enter the purchase price of " + itemNames[i] + ":");
            purchasePrices[i] = sc.nextDouble();

            System.out.println("Enter the selling price of " + itemNames[i] + ":");
            sellingPrices[i] = sc.nextDouble();
            sc.nextLine();  // Consume the newline character

            double profit = sellingPrices[i] - purchasePrices[i];
            double profitPercentage = (profit / purchasePrices[i]) * 100;

            if (profitPercentage < 10) {
                countLessThan10++;
            } else if (profitPercentage <= 20) {
                countBetween10And20++;
            } else {
                countGreaterThan20++;
            }

            totalPurchaseValue += purchasePrices[i];
            totalSellingValue += sellingPrices[i];
            totalProfit += profit;
        }

        System.out.println("Number of items with less than 10% profit: " + countLessThan10);
        System.out.println("Number of items with 10% to 20% profit: " + countBetween10And20);
        System.out.println("Number of items with more than 20% profit: " + countGreaterThan20);
        System.out.println("Total purchase value: " + totalPurchaseValue);
        System.out.println("Total selling value: " + totalSellingValue);
        System.out.println("Total profit: " + totalProfit);

        sc.close();
    }
}
