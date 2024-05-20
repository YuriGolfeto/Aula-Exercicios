package Uni6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int num[] = new int[12];
        Scanner sc = new Scanner(System.in);
        int media = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            media += num[i];
        }
        media = media / 12;
        System.out.println("media " + media);
        for (int i = 0; i < num.length; i++) {
            if (num[i] > media) {
                System.out.println(num[i]);
            }
        }
        sc.close();

    }

}
