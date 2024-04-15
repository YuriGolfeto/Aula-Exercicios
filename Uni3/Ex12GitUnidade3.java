import java.util.Scanner;

public class Ex12GitUnidade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeFuncionario = "Gabriel";
        double valorHoraTrabalho = 10.0, valorPorDependente = 60.0;
        double quantHoraTrabalhada, quantDependentes;
        double aliquotaINSS = 0.085, aliquotaIR = 0.08;
        double salarioBruto, salarioLiquido;
        double descontos;
        

        System.out.println("Digite quantidade horas trabalhadas: ");
        quantHoraTrabalhada = sc.nextDouble();

        System.out.println("Digite quantidade de dependentes: ");
        quantDependentes = sc.nextDouble();
        
        salarioBruto = (quantHoraTrabalhada * valorHoraTrabalho) + (quantDependentes * valorPorDependente);
        descontos = (salarioBruto * aliquotaINSS) + (salarioBruto * aliquotaIR);
        salarioLiquido = salarioBruto + descontos;
                
        System.out.println("Nome funcionario: "+nomeFuncionario);
        System.out.println("Salario Bruto: "+salarioBruto);
        System.out.println("Salario Liquido: "+salarioLiquido);

        sc.close();
    }
}
