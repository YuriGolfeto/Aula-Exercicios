package Uni6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de vetores");
        int n = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < h.length; i++) {
            System.out.println("digite o numero para o " + (i + 1) + "° vetor ");
            h[i] = sc.nextInt();
        }

        System.out.println("digite o valor para pesquisar no vetor");
        int f = sc.nextInt();
        boolean tem = false;
        for (int i = 0; i < h.length; i++) {
            if (h[i] == f) {
                tem = true;
                System.out.println("posição " + (i + 1) + " não possui");
            } else {
                System.out.println("posição " + (i + 1) + " não possui");
            }
        }
        if (tem == true) {
            System.out.println("possui o numero no vetor");
        } else {
            System.out.println("não possui o numero no vetor");
        }
        sc.close();
    }
}
