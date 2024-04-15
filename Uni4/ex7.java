package Uni4;

import java.util.Scanner;

public class ex7 {
//O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
//As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas,
// ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta,
// em gramas, determine o custo do selo.
//Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as gramas");
        double gramas = sc.nextDouble();
        double pesoExtra, valor;
        if (gramas <= 0.50) {
            valor = 0.45;
        }else {
            pesoExtra = gramas-50;
//            double valor2 = pesoExtra/20;
            //System.out.println(valor2);
            int divid = (int)pesoExtra/20+1;
            
            //System.out.println(divid);

            valor = 0.45+(divid*0.45);
        }
        System.out.printf("valor a pagar %.2f R$",valor);
        
        sc.close();
    }
    
}
