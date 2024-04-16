package Uni4;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1:");
        double lado1 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado 2:");
        double lado2 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado 3:");
        double lado3 = sc.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        sc.close();
    }
}
