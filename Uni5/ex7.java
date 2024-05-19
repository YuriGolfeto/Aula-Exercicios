package Uni5;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the number of inputs");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be greater than 0.");
        }

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }

        double maxNumber = numbers[0];
        double minNumber = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.printf("Max number: %.2f\n", maxNumber);
        System.out.printf("Min number: %.2f\n", minNumber);
        sc.close();
    }
}
