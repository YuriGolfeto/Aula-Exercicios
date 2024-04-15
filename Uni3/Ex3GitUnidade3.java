import java.util.Scanner;

public class Ex3GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoLitro, valorPag, qntGasosa;
        
        System.out.println("Digite o preço da Gasosa: ");
        precoLitro = sc.nextDouble();

        System.out.println("Digite o valor total pago: ");
        valorPag = sc.nextDouble();

        qntGasosa = valorPag / precoLitro;

        System.out.println("Quantidade abastecida: "+qntGasosa + " litros");

        sc.close();
    }
}
