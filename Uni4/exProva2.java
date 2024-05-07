package Uni4;

import java.util.Scanner;

public class exProva2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o Digite o valor da região 1");
        int reg1 = sc.nextInt();
        System.out.println("digite o Digite o valor da região 2");
        int reg2 = sc.nextInt();
        System.out.println("digite o Digite o valor da região 3");
        int reg3 = sc.nextInt();

        String valorMenor, valorMedio, valorMaior;

        while (true) {
            System.out.println("Digite o numero da opcão de filtro? \n" +
                    "A ) maior quantidade de habitantes \n" +
                    "B ) menor quantidade de habitantes \n" +
                    "C ) Imprimir em ordem crescente \n" +
                    "D ) Media da quantidades de habitantes");
            char op = sc.next().toUpperCase().charAt(0);
            switch (op) {
                case 'A':
                    if (reg1 >= reg2 && reg1 >= reg3) {
                        System.out.println("região 1 maior numero de pessoas por metro quadrado que seria " +
                                reg1 + " habitantes por metro quadrado");
                    } else if (reg2 >= reg1 && reg2 >= reg3) {
                        System.out.println("região 2 maior numero de pessoas por metro quadrado que seria " +
                                reg2 + " habitantes por metro quadrado");
                    } else if (reg3 >= reg1 && reg3 >= reg2) {
                        System.out.println("região 3 maior numero de pessoas por metro quadrado que seria " +
                                reg3 + " habitantes por metro quadrado");
                    } else {
                        System.out.println("ops algo deu de errado");
                    }
                    break;

                case 'B':
                    if (reg1 <= reg2 && reg1 <= reg3) {
                        System.out.println("região 1 maior numero de pessoas por metro quadrado que seria " +
                                reg1 + " habitantes por metro quadrado");
                    } else if (reg2 <= reg1 && reg2 <= reg3) {
                        System.out.println("região 2 maior numero de pessoas por metro quadrado que seria " +
                                reg2 + " habitantes por metro quadrado");
                    } else if (reg3 <= reg1 && reg3 <= reg2) {
                        System.out.println("região 3 maior numero de pessoas por metro quadrado que seria " +
                                reg3 + " habitantes por metro quadrado");
                    } else {
                        System.out.println("ops algo deu de errado");
                    }
                    break;

                case 'C':

                    if (reg1 <= reg2 && reg1 <= reg3) {
                        valorMenor = "regiao 1 maior valor :" + reg1;
                        if (reg2 <= reg3) {
                            valorMedio = "regiao 2 maior valor :" + reg2;
                            valorMaior = "regiao 3 maior valor :" + reg3;
                        } else {
                            valorMedio = "regiao 3 maior valor :" + reg3;
                            valorMaior = "regiao 2 maior valor :" + reg2;
                        }
                    } else if (reg2 <= reg1 && reg2 <= reg3) {
                        valorMenor = "regiao 2 maior valor :" + reg2;
                        if (reg1 <= reg3) {
                            valorMedio = "regiao 1 maior valor :" + reg1;
                            valorMaior = "regiao 3 maior valor :" + reg3;
                        } else {
                            valorMedio = "regiao 3 maior valor :" + reg3;
                            valorMaior = "regiao 1 maior valor :" + reg1;
                        }
                    } else {
                        valorMenor = "regiao 3 maior valor :" + reg3;
                        if (reg1 <= reg2) {
                            valorMedio = "regiao 1 maior valor :" + reg1;
                            valorMaior = "regiao 2 maior valor :" + reg2;
                        } else {
                            valorMedio = "regiao 2 maior valor :" + reg2;
                            valorMaior = "regiao 1 maior valor :" + reg1;
                        }
                    }
                    System.out.println("Valores:\n" +
                            valorMenor + " \n" +
                            valorMedio + "\n" +
                            valorMaior);
                    break;

                case 'D':
                    System.out.println("media de habitantes = " + ((reg1 + reg2 + reg3) / 3));
                    break;

                default:
                    break;
            }
            System.out.println("Deseja Continuar ?(\"Não\" para sair)");
            char opE = sc.next().toUpperCase().charAt(0);
            if (opE == 'N') {
                break;
            } else {
                System.out.println("continuando");
            }
        }
        sc.close();
    }
}
