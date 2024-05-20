package Uni6;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int num1[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num1.length; i++) {
            System.out.println("digite o " + (i + 1) + "° da lista 1");
            num1[i] = sc.nextInt();
        }
        int num2[] = new int[3];
        for (int i = 0; i < num2.length; i++) {
            System.out.println("digite o " + (i + 1) + "° da lista 2");
            num2[i] = sc.nextInt();
        }
        int num3[] = new int[3];
        for (int i = 0; i < num3.length; i++) {
            System.out.println("digite o " + (i + 1) + "° da lista 3");
            num3[i] = sc.nextInt();
        }
        System.out.print("lista 1 = [");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
            if (i + 1 != 3) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("lista 2 = [");
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]);
            if (i + 1 != 3) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("lista 3 = [");
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i]);
            if (i + 1 != 3) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int numSum[] = new int[3];
        for (int i = 0; i < numSum.length; i++) {
            System.out.println("digite o " + (i + 1) + "° da lista 2");
            numSum[i] = num1[i] + num2[i] + num3[i];
        }

        System.out.print("lista 3 = [");
        for (int i = 0; i < numSum.length; i++) {
            System.out.print(numSum[i]);
            if (i + 1 != 3) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
