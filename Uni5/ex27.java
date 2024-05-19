package Uni5;

import java.util.Scanner;

public class ex27 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day;
        int morningProduction, afternoonProduction;
        char repeat;

        do {
            do {
                System.out.println("Enter the day of April (1 to 30):");
                day = sc.nextInt();
                if (day < 1 || day > 30) {
                    System.out.println("Invalid day.");
                }
            } while (day < 1 || day > 30);

            System.out.println("Enter the morning production:");
            morningProduction = sc.nextInt();
            System.out.println("Enter the afternoon production:");
            afternoonProduction = sc.nextInt();

            double dailyPayment;
            if (day <= 15) {
                if (morningProduction >= 30 && afternoonProduction >= 30 && (morningProduction + afternoonProduction) > 100) {
                    dailyPayment = (morningProduction + afternoonProduction) * 0.80;
                } else {
                    dailyPayment = (morningProduction + afternoonProduction) * 0.50;
                }
            } else {
                dailyPayment = (morningProduction * 0.40) + (afternoonProduction * 0.30);
            }

            System.out.println("Received payment: R$" + dailyPayment);

            System.out.println("New employee? (1.yes 2.no)");
            repeat = sc.next().charAt(0);
        } while (repeat == '1');

        sc.close();
    }
}
