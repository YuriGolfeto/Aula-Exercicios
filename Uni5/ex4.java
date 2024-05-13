package Uni5;

public class ex4 {
    public static void main(String[] args) {
        double sum = 0, z = 0;
        for (double i = 1, y = 3, c = 2; i <= 20; i++, y += 2, c += z) {
            sum = sum + (y / c);
            z = z + 2;
        }

        System.out.println(sum);

    }
}
