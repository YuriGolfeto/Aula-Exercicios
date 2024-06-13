package Uni6.batalha_naval;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char table[][] = new char[8][8];
        System.out.println("Matalha naval");
        int times = 0;
        int ships = 0;
        int acertos = 0;
        System.out.println("_ 1  2  3  4  5  6  7  8 X");
        for (int i = 0; i < table.length; i++) {
            System.out.print("" + (i + 1) + "");
            int collun_times;
            collun_times = 0;
            for (int j = 0; j < table.length; j++) {
                if ((int) (Math.random() * 2) >= 1 && ships < 10 && collun_times < 2) {
                    table[i][j] = 'N';
                    ships++;
                    collun_times++;
                    System.out.print(" N ");
                } else {
                    System.out.print(" ~ ");
                }
            }
            System.out.println("");

        }
        System.out.println("Y");
        System.out.println(ships);
        do {
            System.out.println("posicao X ?");
            int x = sc.nextInt();
            System.out.println("Posicao Y ?");
            int y = sc.nextInt();
            if (x < 8 || y < 8) {

                if (table[x - 1][y - 1] == 'N') {
                    System.out.println("acertou");
                    table[x - 1][y - 1] = 'X';
                    acertos++;
                    times++;
                } else {
                    System.out.println("errou");
                    table[x - 1][y - 1] = 'O';
                    times++;
                }
            } else {
                System.out.println("posicao invalida");
            }
        } while (times <= 30 || acertos <= ships);
        System.out.println("Resumo:");
        for (int i = 0; i < table.length; i++) {
            System.out.print("" + (i + 1) + "");
            for (int j = 0; j < table.length; j++) {

                System.out.print(" " + table[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("Y");
        sc.close();
    }

}
