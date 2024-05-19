package Uni5;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[20];
        double totalHeight = 0;

        for (int i = 0; i < 20; i++) {
            heights[i] = sc.nextDouble();
            totalHeight += heights[i];
        }

        double averageHeight = totalHeight / 20;
        System.out.printf("Average height: %.2f\n", averageHeight);
        sc.close();
    }
}
