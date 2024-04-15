package Uni4;

import java.util.Scanner;

public class exExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inverter oque foi digitado");
        String letra = sc.nextLine();
        char[] letras = letra.toCharArray();
        char[] alt = new char[letras.length];
        int j = 0; 
        for (int i = letras.length; i > 0; i--) {
            
            alt[j]=letras[i-1];
            j++;
        }
        System.out.println(alt);
        sc.close();
    }
}
