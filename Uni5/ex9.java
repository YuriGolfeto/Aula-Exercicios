package Uni5;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid input. n must be greater than 0.");
            sc.close();
            return;
        }

        String[] names = new String[n];
        int[] ages = new int[n];

        System.out.println("Enter the name and age of each student:");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Students who are 18 years old:");
        boolean found18 = false;
        int countAbove20 = 0;

        for (int i = 0; i < n; i++) {
            if (ages[i] == 18) {
                System.out.println(names[i]);
                found18 = true;
            }
            if (ages[i] > 20) {
                countAbove20++;
            }
        }

        if (!found18) {
            System.out.println("No students are 18 years old.");
        }

        System.out.println("Number of students older than 20 years: " + countAbove20);

        sc.close();
    }
}
