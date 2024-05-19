package Uni5;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();

        System.out.println("Number\tDecomposition");

        int divisor = 2;

        while (number != 1) {
            while (number % divisor == 0) {
                System.out.println(number + "\t" + divisor);
                number /= divisor;
            }
            divisor++;
        }

        System.out.println("1\t");

        sc.close();
    }
}
