package Uni4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verdade = true;
        while (verdade) {

            System.out.println("Digite seu sexo");
            String text = sc.nextLine();
            if (text.toUpperCase().charAt(0) == 'M') {
                System.out.println("masculino");
            } else if (text.toUpperCase().charAt(0) == 'F') {
                System.out.println("Feminino");
            } else if (text.toUpperCase().charAt(0) == 'N') {
                System.out.println("Nao binare");
            } else {
                System.out.println("resposta nao identificada");
            }
            System.out.println("deseja continuar?");
            String response = sc.nextLine();
            if (response.toUpperCase().charAt(0) == 'N') {
                verdade = false;
                break;
            }
        }
        sc.close();
    }
}
