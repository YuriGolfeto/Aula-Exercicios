package Uni6;

import java.util.Scanner;

public class ex9 {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
        int quantResp = 4;
        int vetorResposta[][] = new int[quantResp][3];
		String vetorPergunta[] = new String[3];

        vetorPergunta[0] = "Qual o seu sexo?";
        vetorPergunta[1] = "Que nota você dá para o cimena?";
        vetorPergunta[2] = "Qual a sua idade?";

		for(int i = 0; i < quantResp; i++) {
            for(int  j = 0; j < 3; j++) {
                System.out.println("Respondente["+(i+1)+"] Pergunta[" + (j+1) + "] " + vetorPergunta[j]);
                vetorResposta[i][j] = sc.nextInt();
            }
        }
		
        double somaNota = 0.0;
        for (int i = 0; i < quantResp; i++) {
            somaNota = somaNota + vetorResposta[i][1];
        }
        double mediaNota = somaNota / quantResp;
        System.out.println("Nota média recebida pelo cinema: " + mediaNota);


        double somaNotaH = 0.0;
        int contadorH = 0;
        for (int i = 0; i < quantResp; i++) {
            if (vetorResposta[i][0] == 2) {
                somaNotaH = somaNotaH + vetorResposta[i][1];
                contadorH++;
            }
            
        }
        double mediaNotaH;
        if (contadorH > 0) {
            mediaNotaH = somaNotaH / contadorH;
            System.out.println("Nota média atribuída pelos homens: " + mediaNotaH);
        }
        else {
            System.out.println("Nenhum homem respondeu a pesquisa.");
        }

        int menorIdade = 999;
        int indiceMenorIdade = -1;
        for (int i = 0; i < quantResp; i++) {
            if ((vetorResposta[i][0] == 1) && (vetorResposta[i][2] < menorIdade)) {
                indiceMenorIdade = i;
                menorIdade = vetorResposta[i][2];
            }
        }
        if (indiceMenorIdade >= 0) {
            System.out.println("Nota atribuída pela mulher mais jovem: " + vetorResposta[indiceMenorIdade][1]);
            System.out.println("Idade da mulher mais jovem: " + vetorResposta[indiceMenorIdade][2]);
        }
        else {
            System.out.println("Nenhuma mulher respondeu a pesquisa.");
        }

        int contadorMulher50 = 0;
        for (int i = 0; i < quantResp; i++) {
            if ((vetorResposta[i][0] == 1)
                && (vetorResposta[i][2] > 50)
                && (vetorResposta[i][1] > mediaNota)) {
                    contadorMulher50++;
            }
        }
        if (contadorMulher50 > 0) {
            System.out.println("Quantidade de mulheres 50+ anos com nota > média geral: " + contadorMulher50);
        }
        else {
            System.out.println("Nenhuma mulher respondeu a pesquisa.");
        }



		sc.close();
	}
}
