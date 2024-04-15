import java.util.Scanner;

public class Ex4GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, peso1 = 5, peso2 = 3, peso3 = 2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble(); 
        System.out.println("Digite o terceiro numero: ");
        nota3 = sc.nextDouble();
        media = ((nota1*peso1) + (nota2*peso2) + (nota3)*peso3)/(peso1 + peso2 + peso3);
        System.out.println("Sua média ponderada foi: " +media);
        
        sc.close();
    }
}
