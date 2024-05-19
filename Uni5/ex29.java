package Uni5;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value you want to withdraw:");
        int value = sc.nextInt();

        int[] denominations = {20, 10, 5, 2, 1};
        int[] count = new int[5];

        int remainingValue = value;
        int totalNotes = 0;

        for (int i = 0; i < 5; i++) {
            count[i] = remainingValue / denominations[i];
            remainingValue %= denominations[i];
            totalNotes += count[i];
        }

        System.out.println("Minimum number of notes needed: " + totalNotes);

        System.out.println("Notes distribution:");
        for (int i = 0; i < 5; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " note: " + count[i]);
            }
        }

        sc.close();
    }
}
