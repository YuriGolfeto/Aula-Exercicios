package Uni4;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = sc.nextInt();

        double resultado = 0.0;

        if (opcao >= 1 && opcao <= 4) {
            System.out.println("Digite o primeiro número:");
            double num1 = sc.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = sc.nextDouble();

            if (opcao == 1) {
                resultado = num1 + num2;
            } else if (opcao == 2) {
                resultado = num1 - num2;
            } else if (opcao == 3) {
                resultado = num1 * num2;
            } else if (opcao == 4) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: o denominador não pode ser zero.");
                }
            }

            if (opcao != 4 || (opcao == 4 && num2 != 0)) {
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
