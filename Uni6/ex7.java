package Uni6;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de N (máximo 20): ");
        int N = sc.nextInt();
        
        if (N > 20 || N <= 0) {
            System.out.println("Valor de N inválido.");
        }
        
        int[] vetor = new int[N];
        preencherVetor(vetor, sc);
        ordenarVetor(vetor);
        imprimirVetor(vetor);
        
        sc.close();
    }
    
    public static void preencherVetor(int[] vetor, Scanner sc) {
        int count = 0;
        
        while (count < vetor.length) {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            
            if (!existeNoVetor(vetor, numero, count)) {
                vetor[count] = numero;
                count++;
            } else {
                System.out.println("Número já existe no vetor. Digite outro número.");
            }
        }
    }
    
    public static boolean existeNoVetor(int[] vetor, int numero, int count) {
        for (int i = 0; i < count; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
    
    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
    
    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}


