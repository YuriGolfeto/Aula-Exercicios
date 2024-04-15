import java.util.Scanner;

public class Ex16GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorPodut, valorPago, troco, resto, saida;
        int cem, dez, uni;
        
        System.out.println("Digite o valor pago: ");
        valorPago = sc.nextInt();
        
        System.out.println("Digite o valor do produto: ");
        valorPodut = sc.nextInt();

        troco = valorPago - valorPodut;
        cem = troco / 100;
        resto = troco % 100;
        dez = resto/10;
        uni = resto % 10;
        saida = cem + dez + uni;

        System.out.println("Quantidade de notas: "+saida);

        sc.close();
    }
}
