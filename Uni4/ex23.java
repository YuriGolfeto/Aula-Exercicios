package Uni4;

import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do mês:");
        int mes = sc.nextInt();

        String mesExtenso = "";
        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;

            default:
                break;
        }
        /*
         * modo com if
         * if (mes == 1) {
         * mesExtenso = "Janeiro";
         * } else if (mes == 2) {
         * mesExtenso = "Fevereiro";
         * } else if (mes == 3) {
         * mesExtenso = "Março";
         * } else if (mes == 4) {
         * mesExtenso = "Abril";
         * } else if (mes == 5) {
         * mesExtenso = "Maio";
         * } else if (mes == 6) {
         * mesExtenso = "Junho";
         * } else if (mes == 7) {
         * mesExtenso = "Julho";
         * } else if (mes == 8) {
         * mesExtenso = "Agosto";
         * } else if (mes == 9) {
         * mesExtenso = "Setembro";
         * } else if (mes == 10) {
         * mesExtenso = "Outubro";
         * } else if (mes == 11) {
         * mesExtenso = "Novembro";
         * } else if (mes == 12) {
         * mesExtenso = "Dezembro";
         * } else {
         * System.out.println("Valor inválido.");
         * }
         */
        if (!mesExtenso.isEmpty()) {
            System.out.println("O mês é: " + mesExtenso);
        }

        sc.close();
    }
}
