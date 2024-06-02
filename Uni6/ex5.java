package Uni6;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] rapaz = new String[5];
        String[] moça = new String[5];
        
        System.out.println("Respostas do rapaz:");
        lerRespostas(rapaz, sc);
        
        System.out.println("Respostas da moça:");
        lerRespostas(moça, sc);
        
        int afinidade = calcularAfinidade(rapaz, moça);
        
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
        
        sc.close();
    }
    
    public static void lerRespostas(String[] respostas, Scanner sc) {
        for (int i = 0; i < respostas.length; i++) {
            respostas[i] = sc.next().toUpperCase();
        }
    }
    
    public static int calcularAfinidade(String[] rapaz, String[] moça) {
        int afinidade = 0;
        
        for (int i = 0; i < rapaz.length; i++) {
            if (rapaz[i].equals(moça[i])) {
                afinidade += 3;
            } else if (rapaz[i].equals("IND") || moça[i].equals("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        
        return afinidade;
    }
}
