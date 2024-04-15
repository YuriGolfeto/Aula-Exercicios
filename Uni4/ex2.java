package Uni4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero par ou impar :");
        int val = sc.nextInt();
        if(val>0){
            if (val%2 ==0) {
                System.out.println("par ");
            } else {
                System.out.println("inpar ");
            }
        }
        sc.close();
    }
}
