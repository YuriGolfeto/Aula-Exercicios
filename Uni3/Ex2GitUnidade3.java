import java.util.Scanner;

public class Ex2GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorOrig, percentDesc = 0.12, valorFinal;

        System.out.println("Digite o valor original do produto: ");
        valorOrig = sc.nextDouble();

        valorFinal = valorOrig - (valorOrig * percentDesc);

        System.out.println("Valor Final: " + valorFinal);

        sc.close();
        
    }        

}
