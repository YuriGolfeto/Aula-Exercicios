package Uni5;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2, media;

        do {
            System.out.println("Digite o nome do aluno");
            nome = sc.next();

            System.out.println("Digite a nota 1 do aluno");
            nota1 = sc.nextDouble();

            System.out.println("Digite a nota 2 do aluno");
            nota2 = sc.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println("Aluno: " + nome);
            System.out.printf("Média = %.2f\n", media);

        } while (!nome.equals("fim"));

        sc.close();
    }
}
