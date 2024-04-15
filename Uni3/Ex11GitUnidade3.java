import java.util.Scanner;

public class Ex11GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celcius, fahrenheit;
        
        System.out.println("Digite a temperatura em Celcius: ");
        celcius = sc.nextDouble();

        fahrenheit = ((9.0/5)* celcius) + 35;
        
        System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);

        sc.close();
    }
}
