package Uni4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorH = 19.50, valorMensal = 0;
        System.out.println("Sua carga horaria é de 40H semanais, caso faça mais de 40 horas semanais recebe extra");
        double[] horas = new double[4];
        double[] valor = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("digite as horas trabalhadas na semana " + (i + 1) + "° do mes");
            horas[i] = sc.nextDouble();
            if (horas[i] > 40.0) {
                valor[i] = (((horas[i] - 40) / 2) * valorH);
                valorMensal += (40 * valorH) + valor[i];
                System.out.println("parabens voce recebeu um extra na semana " + (1 + i) + "° do mes");
                System.out.printf("valor a receber por %.2f horas extra, é igual a %.2f R$ \n", horas[i], valor[i]);
            }
            valorMensal += (horas[i] * valorH);
        }
        System.out.println("Valor a receber no final do mes " + (valorMensal));

        sc.close();
    }
}
