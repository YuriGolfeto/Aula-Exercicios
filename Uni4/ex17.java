package Uni4;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a renda anual:");
        double rendaAnual = sc.nextDouble();

        System.out.println("Digite o número de dependentes:");
        int numeroDependentes = sc.nextInt();

        double rendaLiquida = rendaAnual - (rendaAnual * (0.02 * numeroDependentes));

        double imposto;

        if (rendaLiquida <= 2000.00) {
            imposto = 0.0;
        } else if (rendaLiquida <= 5000.00) {
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida <= 10000.00) {
            imposto = rendaLiquida * 0.10;
        } else {
            imposto = rendaLiquida * 0.15;
        }

        System.out.println("O imposto de renda a ser pago é: R$" + imposto);

        sc.close();
    }
}
