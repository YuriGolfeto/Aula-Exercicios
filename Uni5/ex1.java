package Uni5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            System.out.println(num[i]);
        }
        for (int i : num) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println("par ");
                } else {
                    System.out.println("impar ");
                }
            } else {
                System.out.println("null");
            }
        }
        sc.close();
    }
}