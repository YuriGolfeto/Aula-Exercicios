package Uni5;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer n:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be a positive integer.");
            sc.close();
        }

        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " - ");
                number++;
            }
            System.out.println();
        }

        sc.close();
    }
}
