import java.util.Scanner;

public class Ex14GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia, tempo, veloMedia, kmLitro = 12, combustivelGasto;
        
        System.out.println("Digite a distancia: ");
        distancia = sc.nextDouble();

        System.out.println("Digite o tempo: ");
        tempo = sc.nextDouble();
        
        veloMedia = distancia / tempo;
        combustivelGasto = distancia / kmLitro;

        System.out.println("Velocidade Média: "+veloMedia + " km/h");
        System.out.println("Combustivel gasto: "+combustivelGasto + " Litros");

        sc.close();
    }
}
