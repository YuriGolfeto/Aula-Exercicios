import java.util.Scanner;

public class Ex5GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chipIdent = 4, chipAlimen = 3.50 * 2, totalGasto = 0;
        int galinhas = 0;

        System.out.println("Digite o numero de galinhas: ");
        galinhas = sc.nextInt();
        
        totalGasto = (chipAlimen + chipIdent)*galinhas;
        
        System.out.println("Teu gasto com galinha foi: " +totalGasto);
        
        sc.close();
    }
}