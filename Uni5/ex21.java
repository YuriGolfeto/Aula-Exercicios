package Uni5;

public class ex21 {
    public static void main(String[] args) {
        double chicoHeight = 1.50;
        double zeHeight = 1.10;
        int chicoGrowthRate = 2;
        int zeGrowthRate = 3;
        int years = 0;

        while (zeHeight <= chicoHeight) {
            chicoHeight += chicoGrowthRate / 100.0;
            zeHeight += zeGrowthRate / 100.0;
            years++;
        }

        System.out.println("It will take " + years + " years for Zé to be taller than Chico.");
    }
}
