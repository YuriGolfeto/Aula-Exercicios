package Uni4;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção (T, Q, R ou C):");
        char opcao = scanner.next().charAt(0);

        double area = 0.0;

        if (opcao == 'T') {
            System.out.println("Digite a base do triângulo:");
            double base = scanner.nextDouble();

            System.out.println("Digite a altura do triângulo:");
            double altura = scanner.nextDouble();

            area = (base * altura) / 2;
        } else if (opcao == 'Q') {
            System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble();

            area = lado * lado;
        } else if (opcao == 'R') {
            System.out.println("Digite a base do retângulo:");
            double base = scanner.nextDouble();

            System.out.println("Digite a altura do retângulo:");
            double altura = scanner.nextDouble();

            area = base * altura;
        } else if (opcao == 'C') {
            System.out.println("Digite o raio do círculo:");
            double raio = scanner.nextDouble();

            area = Math.PI * raio * raio;
        } else {
            System.out.println("Opção inválida.");
        }

        if (area != 0.0) {
            System.out.println("A área é: " + area);
        }

        scanner.close();
    }
}
