package Uni5;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial odometer reading before the trip:");
        double initialOdometer = scanner.nextDouble();

        System.out.println("Enter the final odometer reading after the trip:");
        double finalOdometer = scanner.nextDouble();

        System.out.println("Enter the number of refuels:");
        int numRefuels = scanner.nextInt();

        double[] odometerReadings = new double[numRefuels + 1];
        double[] fuelAmounts = new double[numRefuels];
        
        odometerReadings[0] = initialOdometer;

        for (int i = 0; i < numRefuels; i++) {
            System.out.println("Enter the odometer reading at refuel " + (i + 1) + ":");
            odometerReadings[i + 1] = scanner.nextDouble();
            
            System.out.println("Enter the amount of fuel added at refuel " + (i + 1) + " (in liters):");
            fuelAmounts[i] = scanner.nextDouble();
        }

        double totalKilometers = finalOdometer - initialOdometer;
        double totalFuel = 0;
        double totalFuelEfficiency = 0;

        for (int i = 0; i < numRefuels; i++) {
            double distance = odometerReadings[i + 1] - odometerReadings[i];
            double fuel = fuelAmounts[i];
            double efficiency = distance / fuel;
            totalFuel += fuel;
            totalFuelEfficiency += efficiency;
            System.out.printf("Fuel efficiency for refuel %d: %.2f km/l\n", i + 1, efficiency);
        }

        double averageEfficiency = totalKilometers / totalFuel;
        System.out.printf("Average fuel efficiency for the trip: %.2f km/l\n", averageEfficiency);
        System.out.println("total Fuel Efficiency " + totalFuelEfficiency);

        scanner.close();
    }
}
