package Uni6.batalha_naval;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char table[][] = new char[8][8];
        char tableNavios[][] = new char[8][8];
        int navios = 0, jogadas = 0, acertos = 0;

        // inicia as tableas
        System.out.println("Batalha Naval");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = '~';
                tableNavios[i][j] = '~';
            }
        }

        System.out.println();
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < table.length; i++) {
            int mudarColuna;
            mudarColuna = 0;
            for (int j = 0; j < table.length; j++) {
                if ((int) (Math.random() * 3) == 1 && navios < 10 && mudarColuna < 2) {
                    table[i][j] = 'N';
                    tableNavios[i][j] = 'N';
                    navios++;
                    mudarColuna++;
                }
            }
        }

        while (jogadas < 30 && acertos < 10) {

            // System.out.println();
            // System.out.println("  0 1 2 3 4 5 6 7");
            // for (int i = 0; i < table.length; i++) {
            //     System.out.print(i + " ");
            //     for (int j = 0; j < table.length; j++) {
            //         System.out.print(table[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            jogadas++;

            System.out.println();
            System.out.println("Digite as coordenadas para atacar (linha e coluna, separadas por espaço): ");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            // confere se o jogador jogou em uma posição inválida e se a coordenada
            // informada ja nao foi atacada
            while (((linha < 0 || linha > 7) || (coluna < 0 || coluna > 7))
                    || (table[linha][coluna] == 'O' || table[linha][coluna] == 'X')) {
                System.out.println();
                System.out.println(
                        "A coordenada informada já foi atacada ou a linha / coluna é menor que 0 ou maior que 7. Informe novamente");
                System.out.println();

                System.out.println("Digite as coordenadas para atacar (linha e coluna, separadas por espaço): ");
                linha = sc.nextInt();
                coluna = sc.nextInt();
            }

            // confere se o jogador acerou ou errou a casa
            System.out.println();
            if (table[linha][coluna] == 'N') {
                System.out.println("Acertou!!");
                table[linha][coluna] = 'X';
                acertos++;
            } else {
                System.out.println("Você errou.");
                table[linha][coluna] = 'O';
            }

            // tabuleiro atulizado sem mostrar a posição dos navios
            System.out.println("  0 1 2 3 4 5 6 7");
            for (int i = 0; i < table.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < table.length; j++) {
                    if (table[i][j] == 'N') {
                        System.out.print("~");
                        System.out.print(" ");
                    } else {
                        System.out.print(table[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println();
        if (jogadas == 30) {
            System.out.println("Você atingiu o limite de 30 jogadas e perdeu!");
        } else if (acertos == 10) {
            System.out.println("Parabéns, você ganhou!!");
        }

        System.out.println();
        System.out.println("As posições dos navios eram: ");
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < tableNavios.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tableNavios.length; j++) {
                System.out.print(tableNavios[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}