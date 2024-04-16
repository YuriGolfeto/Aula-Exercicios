package Uni4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de ponto flutuante maior que 0:");
        double num = sc.nextDouble();

        if (num > 0) {
            if (num % 1 == 0) {
                System.out.println("Não foram digitadas casas decimais.");
            } else {
                System.out.println("Foram digitadas casas decimais.");
            }

        } else {
            System.err.println("numero menor que zero nao e valido !!!!");
        }
        sc.close();
    }
}
