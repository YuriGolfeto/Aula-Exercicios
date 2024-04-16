package Uni4;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses que o funcionário foi admitido:");
        int mesesAdmissao = sc.nextInt();

        double salarioAtual = 2000.0;
        double valorReajuste = 0.0;

        if (mesesAdmissao <= 12) {
            valorReajuste = salarioAtual * 0.05;
        } else if (mesesAdmissao <= 48) {
            valorReajuste = salarioAtual * 0.07;
        }

        System.out.println("O valor do reajuste no salário é: R$" + valorReajuste);

        sc.close();
    }
}
