package Uni4;

import java.util.Scanner;

public class exProva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("letra da cor?");
        char letra = sc.next().toUpperCase().charAt(0);
        if (letra == 'A') {
            System.out.println("Azul");

        } else if (letra == 'V') {
            System.out.println("Vermelho");

        } else if (letra == 'M') {
            System.out.println("Marrom");

        } else {
            System.out.println("Entrada Incorreta");

        }

        System.out.println("FIM");
        sc.close();
    }
}
