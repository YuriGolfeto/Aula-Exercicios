import java.util.Scanner;

public class Ex7GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double little = 350, medium = 600,large = 2000;
        int littleQ = 0,mediumQ = 0, largeQ = 0;

        System.out.println("digite a quantidade de garrafas de 350 Ml");
        littleQ = sc.nextInt();

        System.out.println("digite a quantidade de garrafas de 600 Ml");
        mediumQ = sc.nextInt();

        System.out.println("digite a quantidade de garrafas de 2l");
        largeQ = sc.nextInt();
        
        double result = ((double)(((little*littleQ)+(medium*mediumQ)+(large*largeQ))/1000)); 
        System.out.printf("quantidade final em litros a comprar : %.2f L",result);

        sc.close();
    }
}
