package Uni4;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento do primeiro irmão:");
        int ano1 = sc.nextInt();

        System.out.println("Digite o ano de nascimento do segundo irmão:");
        int ano2 = sc.nextInt();

        System.out.println("Digite o ano de nascimento do terceiro irmão:");
        int ano3 = sc.nextInt();

        if (ano1 == ano2 && ano2 == ano3) {
            System.out.println("Os irmãos são trigêmeos.");
        } else if ((ano1 == ano2 && ano2 != ano3) || (ano1 == ano3 && ano3 != ano2) || (ano2 == ano3 && ano3 != ano1)) {
            System.out.println("Os irmãos são gêmeos.");
        } else {
            System.out.println("Os irmãos são apenas irmãos.");
        }

        sc.close();
    }
}
