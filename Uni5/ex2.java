package Uni5;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[5000];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(100);
            System.out.println(num[i]);
        }
        for (int i : num) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println("par ");
                    pares += i;
                } else {
                    System.out.println("impar ");
                    impares += i;
                }
            } else {
                System.out.println("null");
            }
        }
        System.out.println("pares = " + pares);
        System.out.println("impares = " + impares);
    }
}
