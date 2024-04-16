package Uni4;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do Marquinhos:");
        int idadeMarquinhos = sc.nextInt();

        System.out.println("Digite a idade do Zezinho:");
        int idadeZezinho = sc.nextInt();

        System.out.println("Digite a idade da Luluzinha:");
        int idadeLuluzinha = sc.nextInt();

        String caçula;

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            caçula = "Marquinhos";
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            caçula = "Zezinho";
        } else {
            caçula = "Luluzinha";
        }

        System.out.println("O caçula da família é: " + caçula);

        sc.close();
    }
}
