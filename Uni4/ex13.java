package Uni4;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da primeira carta:");
        int carta1 = sc.nextInt();

        System.out.println("Digite o valor da segunda carta:");
        int carta2 = sc.nextInt();

        System.out.println("Digite o valor da terceira carta:");
        int carta3 = sc.nextInt();

        int countBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            countBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            countBoas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            countBoas++;
        }

        if (countBoas == 1) {
            System.out.println("TRUCO");
        } else if (countBoas == 2) {
            System.out.println("SEIS");
        } else if (countBoas == 3) {
            System.out.println("NOVE");
        }

        sc.close();
    }
}
