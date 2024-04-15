import java.util.Scanner;

public class Ex8GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollar =0,valDol=5.02;

        System.out.println("insira a quantidade de dolar que deseja fazer a conversao");
        System.out.println("considere que o dolar esta valendo 5,02 reais");
        dollar = sc.nextDouble();

        System.out.printf("valor final a receber em Reais = %.2f",(dollar*valDol));
        
        sc.close();
    }
}
