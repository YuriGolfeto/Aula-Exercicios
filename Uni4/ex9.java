package Uni4;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número :");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número :");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Os números são múltiplos.");
        } else {
            System.out.println("Os números não são múltiplos.");
        }

        sc.close();

    }

}
