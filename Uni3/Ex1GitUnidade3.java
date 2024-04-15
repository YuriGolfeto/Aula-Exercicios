import java.util.Scanner;

public class Ex1GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comprimento, largura, area;

        System.out.println("Digite o comprimento: ");
        comprimento = sc.nextDouble();

        System.out.println("Digite o largura: ");
        largura = sc.nextDouble();

        area = comprimento * largura;

        System.out.println("Area calculada: " + area);

        sc.close();
    }        

}
