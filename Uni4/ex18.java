package Uni4;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia do vencimento:");
        int diaVencimento = sc.nextInt();

        System.out.println("Digite o dia do pagamento:");
        int diaPagamento = sc.nextInt();

        System.out.println("Digite o valor da prestação:");
        double valorPrestacao = sc.nextDouble();

        double valorTotalPagar = 0.0;

        if (diaPagamento <= diaVencimento) {
            valorTotalPagar = valorPrestacao - (valorPrestacao * 0.1);
            System.out.println("O pagamento está em dia. Valor a ser pago: R$" + valorTotalPagar);
        } else if (diaPagamento <= diaVencimento+5) {
            valorTotalPagar = valorPrestacao;
            System.out.println("Pagamento após o vencimento. Valor a ser pago: R$" + valorTotalPagar);
        } else {
            int diasAtraso = diaPagamento - (diaVencimento+5);
            double multa = diasAtraso * 0.02;
            valorTotalPagar = valorPrestacao + (valorPrestacao * multa);
            System.out.println("Pagamento com atraso. Valor a ser pago com multa: R$" + valorTotalPagar);
        }

        sc.close();
    }
}