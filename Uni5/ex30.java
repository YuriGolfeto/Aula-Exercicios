package Uni5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the initial value (N):");
        int N = sc.nextInt();

        System.out.println("Enter the decrement value (K):");
        int K = sc.nextInt();

        System.out.println("Enter the backpack size (M):");
        int M = sc.nextInt();

        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = N; i >= 1; i -= K) {
            elements.add(i);
        }

        ArrayList<Integer> inBackpack = new ArrayList<>();
        int sumInBackpack = 0;
        for (int element : elements) {
            if (M - element >= 0) {
                inBackpack.add(element);
                sumInBackpack += element;
                M -= element;
            }
        }

        ArrayList<Integer> outOfBackpack = new ArrayList<>();
        int sumOutOfBackpack = 0;
        for (int element : elements) {
            if (!inBackpack.contains(element)) {
                outOfBackpack.add(element);
                sumOutOfBackpack += element;
            }
        }

        System.out.println("Elements to be placed in the backpack: " + elements);
        System.out.println("Elements that went into the backpack: " + inBackpack);
        System.out.println("Elements that stayed out of the backpack: " + outOfBackpack);
        System.out.println("Sum of elements that went into the backpack: " + sumInBackpack);
        System.out.println("Sum of elements that stayed out of the backpack: " + sumOutOfBackpack);

        sc.close();
    }
}
