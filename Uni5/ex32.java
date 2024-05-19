package Uni5;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week of the first day of the month (1=Sunday, 2=Monday, ..., 7=Saturday):");
        int firstDayOfWeek = sc.nextInt();

        System.out.println("Enter the number of days in the month:");
        int numberOfDays = sc.nextInt();

        String[] daysOfWeek = {"D", "S", "T", "Q", "Q", "S", "S"};

        int currentDayOfWeek = firstDayOfWeek;

        for (int i = 0; i < 7; i++) {
            System.out.print(daysOfWeek[(i + firstDayOfWeek - 1) % 7] + "\t");
        }
        System.out.println();

        int dayOfMonth = 1;

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("\t");
        }

        while (dayOfMonth <= numberOfDays) {
            System.out.print(dayOfMonth + "\t");
            dayOfMonth++;
            currentDayOfWeek++;
            if (currentDayOfWeek > 7) {
                currentDayOfWeek = 1;
                System.out.println();
            }
        }

        System.out.println();

        sc.close();
    }
}
