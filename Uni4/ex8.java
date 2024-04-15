package Uni4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra para saber se tem vogal ou nao");
        String letra = sc.nextLine();
        char[] letras = letra.toCharArray();
        for (char c : letras) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println(c+" é uma vogal");  
            }else{
                System.out.println(c+" não e uma vogal");
            }
            
        }
        sc.close();
    }
}
