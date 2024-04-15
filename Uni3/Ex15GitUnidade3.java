import java.util.Scanner;

public class Ex15GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada, resto;
        String saida;
        int cem, dez, uni;
        
        System.out.println("Digite um nº de até 3 digitos: ");
        entrada = sc.nextInt();

        cem = entrada / 100;
        resto = entrada % 100;
        dez = resto/10;
        uni = resto % 10;

        saida = cem + " centena(s) " + dez + " dezena(s) " + uni + " unidade(s) ";
        System.out.println("resultado: "+saida);

        sc.close();
    }
}
