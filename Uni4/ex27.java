package Uni4;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário de chegada (horas minutos):");
        int horaChegada = sc.nextInt();
        int minutoChegada = sc.nextInt();

        System.out.println("Digite o horário de partida (horas minutos):");
        int horaPartida = sc.nextInt();
        int minutoPartida = sc.nextInt();

        int minutosEstacionado = calcularMinutosEstacionado(horaChegada, minutoChegada, horaPartida, minutoPartida);

        double preco = calcularPreco(minutosEstacionado);

        System.out.println("Tempo estacionado: " + minutosEstacionado + " minutos");
        System.out.println("Preço a ser cobrado: R$" + preco);

        sc.close();
    }

    private static int calcularMinutosEstacionado(int horaChegada, int minutoChegada, int horaPartida,
            int minutoPartida) {
        int totalMinutosChegada = horaChegada * 60 + minutoChegada;
        int totalMinutosPartida = horaPartida * 60 + minutoPartida;

        int minutosEstacionado = totalMinutosPartida - totalMinutosChegada;

        if (minutosEstacionado <= 29) {
            minutosEstacionado = 60;
        } else {
            minutosEstacionado = (minutosEstacionado + 29) / 60 * 60;
        }

        return minutosEstacionado;
    }

    private static double calcularPreco(int minutosEstacionado) {
        double preco = 0.0;

        if (minutosEstacionado <= 120) {
            preco = minutosEstacionado / 60 * 5.0;
        } else if (minutosEstacionado <= 240) {
            preco = 10.0 + ((minutosEstacionado - 120) / 60 * 7.5);
        } else {
            preco = 25.0 + ((minutosEstacionado - 240) / 60 * 10.0);
        }

        return preco;
    }
}
