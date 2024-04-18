package Uni4;

import java.util.Scanner;

public class ex24B {
    public static void main(String[] args) {
        // declarar variável
        int opcao, a, b, c;
        String resultado = "";
        int valorMenor = 0, valorMeio = 0, valorMaior = 0;

        // declarar teclado
        Scanner teclado = new Scanner(System.in);

        // ler valores de entrada
        opcao = teclado.nextInt();
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if (a <= b && b <= c) {
            valorMenor = a;
            valorMeio = b;
            valorMaior = c;
        } else if (a <= c && c <= b) {
            valorMenor = a;
            valorMeio = c;
            valorMaior = b;
        } else if (b <= a && a <= c) {
            valorMenor = b;
            valorMeio = a;
            valorMaior = c;
        } else if (b <= c && c <= a) {
            valorMenor = b;
            valorMeio = c;
            valorMaior = a;
        } else if (c <= a && a <= b) {
            valorMenor = c;
            valorMeio = a;
            valorMaior = b;
        } else if (c <= b && b <= a) {
            valorMenor = c;
            valorMeio = b;
            valorMaior = a;
        }

        switch (opcao) {
            case 1:
                resultado = valorMenor + " " + valorMeio + " " + valorMaior;
                break;

            case 2:
                resultado = valorMaior + " " + valorMeio + " " + valorMenor;
                break;

            case 3:
                resultado = valorMeio + " " + valorMaior + " " + valorMenor;
                break;

            default:
                resultado = "Valor inválido";
                break;
        }

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}
