package Uni4;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int dia = sc.nextInt();

        System.out.println("Digite o mês:");
        int mes = sc.nextInt();

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                    if (dia >= 1 && dia <= 29) {
                        dataValida = true;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        dataValida = true;
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    dataValida = true;
                }
            } else {
                if (dia >= 1 && dia <= 31) {
                    dataValida = true;
                }
            }
        }

        if (dataValida) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }

        sc.close();
    }
}
