package Uni6;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double num[] = new double[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("digite o " + (i + 1) + "° da lista");
            num[i] = sc.nextDouble();
        }
        System.out.println("lista digitada = {");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + ", ");
        }
        System.out.println("}");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("posição " + (i + 1) + " ° par ");
                num[i] += num[i] * 0.03;
            } else {
                System.out.println("posição " + (i + 1) + " ° inpar ");
                num[i] += num[i] * 0.05;
            }
        }
        System.out.println("valores atializados {");
        System.out.println("lista digitada = {");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + ", ");
        }
        System.out.println("}");
        sc.close();
    }

}
