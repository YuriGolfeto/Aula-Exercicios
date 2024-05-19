package Uni5;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum toll value Astolfo refuses to pay:");
        double maxToll = scanner.nextDouble();

        int aboveMaxTollCount = 0;
        int totalTrechos = 0;
        int above150KmAndAcceptedToll = 0;

        while (true) {
            System.out.println("Enter the toll value (or -1 to finish):");
            double toll = scanner.nextDouble();

            if (toll < 0) {
                break;
            }

            System.out.println("Enter the distance of this stretch (in Km):");
            int distance = scanner.nextInt();

            totalTrechos++;

            if (toll > maxToll) {
                aboveMaxTollCount++;
            }

            if (toll <= maxToll && distance > 150) {
                above150KmAndAcceptedToll++;
            }
        }

        System.out.println("Number of stretches with toll above the maximum Astolfo refuses to pay: " + aboveMaxTollCount);
        System.out.println("Total number of stretches informed: " + totalTrechos);
        System.out.println("Number of stretches above 150km with toll accepted by Astolfo: " + above150KmAndAcceptedToll);

        scanner.close();
    }
}
