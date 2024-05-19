package Uni5;

import java.util.Scanner;

public class ex20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial mass of the radioactive material (in kilograms): ");
        double initialMass = sc.nextDouble();

        double thresholdMass = 0.0005;
        double halfLife = 50;
        double currentMass = initialMass;
        int timeInSeconds = 0;

        while (currentMass >= thresholdMass) {
            currentMass /= 2;
            timeInSeconds += halfLife;
        }

        double finalMass = currentMass * 1000;
        double timeInMinutes = timeInSeconds / 60.0;

        System.out.println("Initial mass: " + initialMass + " kilograms");
        System.out.printf("Final mass: %.2f grams \n", finalMass);
        System.out.printf("Time required for decay: %.2f minutes \n",timeInMinutes);

        sc.close();
    }
}
