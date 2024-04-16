package Uni4;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada X:");
        double x = sc.nextDouble();

        System.out.println("Digite a coordenada Y:");
        double y = sc.nextDouble();

        int quadrante;

        if (x == 0 && y == 0) {
            quadrante = 0;
        } else if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x > 0 && y < 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else {
            quadrante = 4;
        }

        System.out.println("O ponto está no quadrante: " + quadrante);

        sc.close();
    }
}
