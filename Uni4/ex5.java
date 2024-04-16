package Uni4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a cor e azul?");
        String resposta = sc.next();
        if (resposta.toUpperCase().charAt(0) == 'S') {
            System.out.println("Sim e azul");
        } else if (resposta.toUpperCase().charAt(0) == 'N') {
            System.out.println("não, não é azul");
        } else {
            System.out.println("so pode ser respondido com Sim ou Não");
        }
        sc.close();
    }
}
