package Uni5;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char genero;
        double altura;

        System.out.println("Digite o gênero");
        genero = sc.next().toUpperCase().charAt(0);

        System.out.println("Digite a altura");
        altura = sc.nextDouble();

        int quantidadeMulheres = 0;
        int quantidadeGrupo = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaGrupo = 0;

        while (altura != 0) {
            quantidadeGrupo++;
            somaAlturaGrupo += altura;

            if (genero == 'F') {
                quantidadeMulheres++;
                somaAlturaMulheres += altura;
            }

            System.out.println("Digite o gênero");
            genero = sc.next().toUpperCase().charAt(0);

            System.out.println("Digite a altura");
            altura = sc.nextDouble();
        }

        System.out.println("Quantidade grupo = " + quantidadeGrupo);
        System.out.println("Média altura grupo = " + somaAlturaGrupo / quantidadeGrupo);

        System.out.println("Quantidade mulheres = " + quantidadeMulheres);
        System.out.println("Média altura grupo = " + somaAlturaMulheres / quantidadeMulheres);

        sc.close();
    }
}
