import java.util.Scanner;

public class Ex6GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoKilo = 25, tara = 0.75, pesoPrato = 0, totalPagar = 0;
        
        System.out.println("Digite o peso do prato: ");
        pesoPrato = sc.nextDouble();
        
        totalPagar = (pesoPrato - tara) * precoKilo;

        System.out.println("Custo do prato: " +totalPagar);
        
        sc.close();
    }
}