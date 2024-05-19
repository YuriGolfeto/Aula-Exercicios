package Uni5;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalClosedAccounts = 0;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("(1) Close a guest's account");
            System.out.println("(2) Check the number of closed accounts");
            System.out.println("(3) Exit");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter the guest's name:");
                String name = sc.next();
                System.out.println("Enter the number of nights:");
                int numberOfNights = sc.nextInt();

                double serviceFee;

                if (numberOfNights < 15) {
                    serviceFee = 7.50;
                } else if (numberOfNights == 15) {
                    serviceFee = 6.50;
                } else {
                    serviceFee = 5.00;
                }

                double totalBill = 50.00 * numberOfNights + serviceFee;
                System.out.println("Name: " + name);
                System.out.println("Total to be paid: $ " + totalBill);

                totalClosedAccounts++;
            } else if (option == 2) {
                System.out.println("Number of closed accounts: " + totalClosedAccounts);
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Incorrect option. Please choose a valid option.");
            }
        }

        sc.close();
    }
}
