package Uni5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de vezes do loop");
        int times = sc.nextInt();
        int base = 8;
        int value[] = new int[times];
        for (int i = 0; i < value.length; i++) {
            if (i % 2 != 0) {
                value[i] = base;
                base = base * 2;
                continue;
            } else {
                value[i] = base + 2;
                continue;
            }

        }
        for (int i : value) {
            System.out.print("" + i + " ,");
        }
        sc.close();
    }
}
