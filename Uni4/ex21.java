package Uni4;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a massa");
        double massa = sc.nextDouble();
        System.out.println("digite a altura");
        double alt = sc.nextDouble();
        double IMC = massa / (alt * alt);
        if (IMC < 18.5) {
            System.out.println("Magreza");
        } else if (IMC < 24.9 && IMC > 18.5) {
            System.out.println("Saudável");

        } else if (IMC < 29.9 && IMC > 25) {
            System.out.println("Sobrepeso");

        } else if (IMC < 34.9 && IMC > 30) {
            System.out.println("Obesidade Grau I");

        } else if (IMC < 39.9 && IMC > 35) {
            System.out.println("Obesidade Grau II (severa)");

        } else if (IMC > 40) {
            System.out.println("Obesidade Grau III (morbida)");

        }
        sc.close();
    }

}
