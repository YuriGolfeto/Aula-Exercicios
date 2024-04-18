package Uni4;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção \n" +
                "T para calcaular a area do triangulo\n" +
                "Q para calcular a area de um quadrado\n" +
                "R para calcular a area de um retangulo\n" +
                "C para calcular a area de um circulo");
        char op = scanner.next().toUpperCase().charAt(0);

        double altura, base;
        double area = 0.0;
        switch (op) {
            case 'T':
                System.out.println("Digite a base do triângulo:");
                base = scanner.nextDouble();

                System.out.println("Digite a altura do triângulo:");
                altura = scanner.nextDouble();

                area = (base * altura) / 2;
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado:");
                double lado = scanner.nextDouble();

                area = lado * lado;
                break;
            case 'R':
                System.out.println("Digite a base do retângulo:");
                base = scanner.nextDouble();

                System.out.println("Digite a altura do retângulo:");
                altura = scanner.nextDouble();

                area = base * altura;
                break;
            case 'C':
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();

                area = Math.PI * raio * raio;
                break;
            default:
                break;
        }
        /*
         * if (op == 'T') {
         * System.out.println("Digite a base do triângulo:");
         * base = scanner.nextDouble();
         * 
         * System.out.println("Digite a altura do triângulo:");
         * altura = scanner.nextDouble();
         * 
         * area = (base * altura) / 2;
         * } else if (op == 'Q') {
         * System.out.println("Digite o lado do quadrado:");
         * double lado = scanner.nextDouble();
         * 
         * area = lado * lado;
         * } else if (op == 'R') {
         * System.out.println("Digite a base do retângulo:");
         * base = scanner.nextDouble();
         * 
         * System.out.println("Digite a altura do retângulo:");
         * altura = scanner.nextDouble();
         * 
         * area = base * altura;
         * } else if (op == 'C') {
         * System.out.println("Digite o raio do círculo:");
         * double raio = scanner.nextDouble();
         * 
         * area = Math.PI * raio * raio;
         * } else {
         * System.out.println("Opção inválida.");
         * }
         */
        if (area != 0.0) {
            System.out.println("A área é: " + area);
        }

        scanner.close();
    }
}
