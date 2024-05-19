package Uni5;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be greater than 0.");
        }

        int[] numbers = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Integer minNegative = null;
        int sumPositive = 0;
        int countPositive = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                if (minNegative == null || numbers[i] < minNegative) {
                    minNegative = numbers[i];
                }
            } else if (numbers[i] > 0) {
                sumPositive += numbers[i];
                countPositive++;
            }
        }

        if (minNegative != null) {
            System.out.printf("Min negative value: %d\n", minNegative);
        } else {
            System.out.println("No negative values.");
        }

        if (countPositive > 0) {
            double averagePositive = (double) sumPositive / countPositive;
            System.out.printf("Average of positive values: %.2f\n", averagePositive);
        } else {
            System.out.println("No positive values.");
        }
        sc.close();
    }
}
