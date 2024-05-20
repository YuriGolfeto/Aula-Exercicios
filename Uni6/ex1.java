package Uni6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = num.length; i > 0; i--) {
            System.out.println(num[i - 1]);
        }
        sc.close();
    }
}
