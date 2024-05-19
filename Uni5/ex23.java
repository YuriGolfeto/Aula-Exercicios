package Uni5;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Enter the name of the seller:");
            String name = sc.nextLine();

            System.out.println("Enter the number of products sold by " + name + ":");
            int numberOfProducts = sc.nextInt();

            double totalSales = 0;

            for (int i = 0; i < numberOfProducts; i++) {
                System.out.println("Enter the unit price of product " + (i + 1) + ":");
                double unitPrice = sc.nextDouble();

                System.out.println("Enter the quantity sold of product " + (i + 1) + ":");
                int quantitySold = sc.nextInt();

                totalSales += unitPrice * quantitySold;
            }

            double salary = totalSales * 0.30; // 30% commission
            System.out.println("Name: " + name);
            System.out.println("Total sales: R$" + totalSales);
            System.out.println("Salary: R$" + salary);

            sc.nextLine(); // Consume the newline character

            System.out.println("Do you want to enter the data of another seller? (y / n)");
            String choice = sc.nextLine().toLowerCase();
            continueInput = choice.toLowerCase().equals("y");
        }

        sc.close();
    }

}