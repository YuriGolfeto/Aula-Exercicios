package Uni4;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o curso:");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação");
        int opcao = sc.nextInt();

        String titulo = "";

        switch (opcao) {
            case 1:
                titulo = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulo = "Licenciado em Computação";
                break;
            case 3:
                titulo = "Bacharel em Sistemas de Informação";
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (!titulo.isEmpty()) {
            System.out.println("O título que você receberá é: " + titulo);
        }

        sc.close();
    }
}
