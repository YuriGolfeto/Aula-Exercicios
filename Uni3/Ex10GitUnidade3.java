import java.util.Scanner;

public class Ex10GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hipotenusa, cateto1, cateto2;
      
        System.out.println("Digite o primeiro cateto: ");
        cateto1 = sc.nextDouble();

        System.out.println("Digite o segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.println("Valor da hipotenusa: "+hipotenusa);

        sc.close();
    }
}
