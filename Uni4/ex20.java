package Uni4;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova:");
        double notaProva1 = sc.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double notaProva2 = sc.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double notaProva3 = sc.nextDouble();

        System.out.println("Digite a média dos exercícios:");
        double mediaExercicios = sc.nextDouble();

        double media = (notaProva1 + notaProva2 + notaProva3 + mediaExercicios) / 4.0;

        char conceito;
        if (media >= 9.0) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6.0) {
            conceito = 'C';
        } else if (media >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        String situacao;
        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            situacao = "aprovado";
        } else {
            situacao = "reprovado";
        }

        System.out.println("Média de aproveitamento: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

        sc.close();
    }
}
