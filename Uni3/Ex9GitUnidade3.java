import java.util.Scanner;

public class Ex9GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, pi = 3.14, altura, volume;

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();

        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();

        volume = pi * raio * raio  * altura;

        System.out.println("Volume total: "+volume);

        sc.close();
    }
}
