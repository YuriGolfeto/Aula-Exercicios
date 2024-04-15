import java.util.Scanner;

public class Ex13GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comprimento, altura, custoUnidadeAzulejo = 13;
        double razaoMetroAzulejo = 9, custoFinal;
    
        System.out.println("Digite o comprimento em metros: ");
        comprimento = sc.nextDouble();

        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        
        custoFinal = (comprimento * altura) * razaoMetroAzulejo * custoUnidadeAzulejo;
        System.out.println("Custo Final: " +Math.ceil(custoFinal));

        sc.close();
    }
}
