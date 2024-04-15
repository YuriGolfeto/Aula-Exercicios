package Uni4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("digite o primeiro numero:");
        num1 = sc.nextInt();
        System.out.println("digite o segundo numero:");
        num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println(num1+" e o maior numero ");            
        }else{
            System.out.println(num2+" é o maior numero");
        }
        sc.close();
    }
}
